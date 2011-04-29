package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Professor.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Professor extends Pessoa {
	public enum GrauAcademico {
		licenciado, mestre, doutor, agregado
	}

	public enum Categoria {
		assistente, profAuxiliar, profAssociado, profCatedratico, profAuxiliarConvidado
	}

	private static Set<Professor> professores = new HashSet<Professor>(1000);

	private GrauAcademico grau;
	private Categoria nivel;
	private int extensao;
	private String gabinete;
	private Seccao seccao;

	/** Invariante da classe. */
	private boolean checkInvariants() {
		return checkInvariant_Extensao() && checkInvariant_Gabinete()
				&& checkInvariant_Grau() && checkInvariant_Nivel()
				&& checkInvariant_Seccao();
	}

	private boolean checkInvariant_Grau() {
		return grau != null;
	}

	private boolean checkInvariant_Nivel() {
		return nivel != null;
	}

	private boolean checkInvariant_Extensao() {
		return extensao > 0;
	}

	private boolean checkInvariant_Gabinete() {
		return gabinete != null && gabinete.length() > 0;
	}

	private boolean checkInvariant_Seccao() {
		return seccao != null;
	}

	/***********************************************************
	 * @return the professores
	 ***********************************************************/
	public static Set<Professor> objectos() {
		return professores;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		professores.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> regidas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Disciplina d : Disciplina.objectos())
			if (d.getRegente() == this)
				result.add(d);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> leccionadas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Disciplina d : Disciplina.objectos())
			if (d.getEquipaDocente().contains(this))
				result.add(d);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Curso> curso_cc() {
		Set<Curso> result = new HashSet<Curso>();
		for (Curso c : Curso.objectos())
			if (c.getComissaoCientifica().contains(this))
				result.add(c);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Curso curso_c() {
		Curso result = null;
		for (Curso c : Curso.objectos())
			if (c.getCoordenador() == this)
				result = c;
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Curso curso_ce() {
		Curso result = null;
		for (Curso c : Curso.objectos())
			if (c.getCoordenadorErasmus() == this)
				result = c;
		return result;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Professor() {
		super();
		professores.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param grau
	 * @param nivel
	 * @param extensao
	 * @param gabinete
	 * @param seccao
	 ***********************************************************/
	public Professor(String nome, CalendarDate dataNascimento, String email,
			GrauAcademico grau, Categoria nivel, int extensao, String gabinete,
			Seccao seccao) {
		super(nome, dataNascimento, email);
		assert grau != null : "Invalid grau -> " + grau;
		assert nivel != null : "Invalid categoria -> " + nivel;
		assert extensao > 0 : "Invalid extensao -> " + extensao;
		assert gabinete != null && gabinete.length() > 0 : "Invalid gabinete -> "
				+ gabinete;
		assert seccao != null : "Invalid seccao -> " + seccao;

		this.grau = grau;
		this.nivel = nivel;
		this.extensao = extensao;
		this.gabinete = gabinete;
		this.seccao = seccao;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		professores.add(this);
	}

	/***********************************************************
	 * @return the grau
	 ***********************************************************/
	public GrauAcademico getGrau() {
		return grau;
	}

	/***********************************************************
	 * @return the nivel
	 ***********************************************************/
	public Categoria getNivel() {
		return nivel;
	}

	/***********************************************************
	 * @return the extensao
	 ***********************************************************/
	public int getExtensao() {
		return extensao;
	}

	/***********************************************************
	 * @return the gabinete
	 ***********************************************************/
	public String getGabinete() {
		return gabinete;
	}

	/***********************************************************
	 * @param grau
	 *            the grau to set
	 ***********************************************************/
	public void setGrau(GrauAcademico grau) {
		assert grau != null : "Invalid grau -> " + grau;
		this.grau = grau;
		assert checkInvariant_Grau() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param nivel
	 *            the nivel to set
	 ***********************************************************/
	public void setNivel(Categoria nivel) {
		assert nivel != null : "Invalid nivel -> " + nivel;
		this.nivel = nivel;
		assert checkInvariant_Nivel() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param extensao
	 *            the extensao to set
	 ***********************************************************/
	public void setExtensao(int extensao) {
		assert extensao > 0 : "Invalid extensao -> " + extensao;
		this.extensao = extensao;
		assert checkInvariant_Extensao() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param gabinete
	 *            the gabinete to set
	 ***********************************************************/
	public void setGabinete(String gabinete) {
		assert gabinete != null && gabinete.length() > 0 : "Invalid gabinete -> "
				+ gabinete;
		this.gabinete = gabinete;
		assert checkInvariant_Gabinete() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param d
	 * @param a
	 * @param nota
	 ***********************************************************/
	public void lancaResultado(Disciplina d, Aluno a, int nota) {
		assert d != null : "Invalid disciplina";
		assert a != null : "Invalid aluno";
		assert nota >= 0 : "Invalid nota";
		assert a.disciplinas().contains(a) : "O aluno nao esta inscrito na disciplina";
		assert !a.notaLancada(d) : "A nota do aluno ja esta lancada";
		assert leccionadas().contains(d) : "O professor nao lecciona a disciplina";

		for (Inscricao i : a.inscricoes())
			if (i.getDisciplina() == d)
				i.setResultado(nota);

		assert a.notaLancada(d) : "A nota deveria estar lancada";
	}

	/***********************************************************
	 * @return the seccao
	 ***********************************************************/
	public Seccao getSeccao() {
		return seccao;
	}

	/***********************************************************
	 * @param seccao
	 *            the seccao to set
	 ***********************************************************/
	public void setSeccao(Seccao seccao) {
		assert seccao != null : "Invalid seccao -> " + seccao;
		this.seccao = seccao;
		assert checkInvariant_Seccao() : "Class Invariant isn't satisfied";
	}

	@Override
	public String toString() {
		return "Professor [grau=" + grau + ", nivel=" + nivel + ", extensao="
				+ extensao + ", gabinete=" + gabinete + ", seccao="
				+ seccao.getNome() + "]";
	}

}

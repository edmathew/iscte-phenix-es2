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
		this.grau = grau;
		this.nivel = nivel;
		this.extensao = extensao;
		this.gabinete = gabinete;
		this.seccao = seccao;

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
		this.grau = grau;
	}

	/***********************************************************
	 * @param nivel
	 *            the nivel to set
	 ***********************************************************/
	public void setNivel(Categoria nivel) {
		this.nivel = nivel;
	}

	/***********************************************************
	 * @param extensao
	 *            the extensao to set
	 ***********************************************************/
	public void setExtensao(int extensao) {
		this.extensao = extensao;
	}

	/***********************************************************
	 * @param gabinete
	 *            the gabinete to set
	 ***********************************************************/
	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}

	/***********************************************************
	 * @param d
	 * @param a
	 * @param nota
	 ***********************************************************/
	public void lancaResultado(Disciplina d, Aluno a, int nota) {
		assert d.getEquipaDocente().contains(this) : "O Docente não pertence à equipa Docente da Disciplina";
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
		this.seccao = seccao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Professor [grau=" + grau + ", nivel=" + nivel + ", extensao="
				+ extensao + ", gabinete=" + gabinete + ", seccao="
				+ seccao.getNome() + "]";
	}

}

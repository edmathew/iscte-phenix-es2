package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * @author fba
 * 14 de Mar de 2011
 *
 ***********************************************************/
/***********************************************************
 * @author fba 16 de Mar de 2011
 * 
 ***********************************************************/
public class Aluno extends Pessoa {
	private static Set<Aluno> alunos = new HashSet<Aluno>(10000);

	private int numero;

	private boolean checkInvariants() {
		return numero > 0;
	}

	/***********************************************************
	 * @return the alunos
	 ***********************************************************/
	public static Set<Aluno> objectos() {
		return alunos;
	}

	/***********************************************************
    * 
    ***********************************************************/
	public static void reset() {
		alunos.clear();
	}

	/***********************************************************
    * 
    ***********************************************************/
	public Aluno() {
		super();
		alunos.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param numero
	 ***********************************************************/
	public Aluno(String nome, CalendarDate dataNascimento, String email,
			int numero) {
		super(nome, dataNascimento, email);
		assert numero > 0 : "Invalid numero";
		this.numero = numero;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		alunos.add(this);
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Inscricao> inscricoes() {
		Set<Inscricao> result = new HashSet<Inscricao>();
		for (Inscricao i : Inscricao.objectos())
			if (i.getAluno() == this)
				result.add(i);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> disciplinas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Inscricao i : inscricoes())
			result.add(i.getDisciplina());
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Matricula> matriculas() {
		Set<Matricula> result = new HashSet<Matricula>();
		for (Matricula m : Matricula.objectos())
			if (m.getAluno() == this)
				result.add(m);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Perfil> perfis() {
		Set<Perfil> result = new HashSet<Perfil>();
		for (Matricula m : matriculas())
			result.add(m.getPerfil());
		return result;
	}

	/***********************************************************
	 * @return the numero
	 ***********************************************************/
	public int getNumero() {
		return numero;
	}

	/***********************************************************
	 * @param numero
	 *            the numero to set
	 ***********************************************************/
	public void setNumero(int numero) {
		assert numero > 0 : "Invalid numero";
		this.numero = numero;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param c
	 * @return
	 ***********************************************************/
	public int creditosObtidos(Curso c) {
		assert c != null : "Invalid curso";
		assert inscritoNoCurso(c) : "Aluno não está inscrito no curso";
		int result = 0;
		for (Oferta o : Oferta.objectos())
			if (o.getPerfil().getCurso() == c
					&& aprovadas().contains(o.getDisciplina()))
				result += o.getEcts();

		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> aprovadas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Inscricao i : inscricoes())
			if (i.getResultado() >= 10 && i.getResultado() <= 20)
				result.add(i.getDisciplina());
		return result;
	}

	public boolean notaLancada(Disciplina d) {
		assert d != null : "Invalid disciplina";
		for (Inscricao i : inscricoes())
			if (i.getDisciplina() == d && !i.notaLancada())
				return true;

		return false;
	}

	public boolean inscritoNoCurso(Curso c) {
		assert c != null : "Invalid curso";
		for (Perfil p : perfis())
			if (p.getCurso() == c)
				return true;
		return false;
	}

	public int nota(Disciplina d) {
		assert d != null : "Invalid disciplina";
		for (Inscricao i : inscricoes())
			if (i.getDisciplina() == d)
				return i.getResultado();

		return -1;
	}

	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome()=" + getNome()
				+ ", email()=" + getEmail() + "]";
	}

}

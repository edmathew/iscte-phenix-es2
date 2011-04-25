package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Perfil.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Perfil {
	private static Set<Perfil> perfis = new HashSet<Perfil>(250);

	private String nome;
	private int ects;

	private Curso curso;

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0 && curso != null && ects >= 0;
	}

	/***********************************************************
	 * @return the perfis
	 ***********************************************************/
	public static Set<Perfil> objectos() {
		return perfis;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		perfis.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Matricula> matriculas() {
		Set<Matricula> result = new HashSet<Matricula>();
		for (Matricula m : Matricula.objectos())
			if (m.getPerfil() == this)
				result.add(m);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Aluno> alunos() {
		Set<Aluno> result = new HashSet<Aluno>();
		for (Matricula m : matriculas())
			result.add(m.getAluno());
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Oferta> ofertas() {
		Set<Oferta> result = new HashSet<Oferta>();
		for (Oferta o : Oferta.objectos())
			if (o.getPerfil() == this)
				result.add(o);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> disciplinas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Oferta o : ofertas())
			result.add(o.getDisciplina());
		return result;
	}

	/***********************************************************
       * 
       ***********************************************************/
	public Perfil() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
		perfis.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param curso
	 ***********************************************************/
	public Perfil(String nome, int ects, Curso curso) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		assert ects >= 0 : "Invalid ects";
		assert curso != null : "Invalid curso";

		this.nome = nome;
		this.ects = ects;
		this.curso = curso;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		perfis.add(this);
	}

	/***********************************************************
	 * @return the nome
	 ***********************************************************/
	public String getNome() {
		return nome;
	}

	/***********************************************************
	 * @param nome
	 *            the nome to set
	 ***********************************************************/
	public void setNome(String nome) {
		assert nome != null && nome.length() > 0;
		this.nome = nome;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @return the ects
	 ***********************************************************/
	public int getEcts() {
		return ects;
	}

	/***********************************************************
	 * @param ects
	 *            the ects to set
	 ***********************************************************/
	public void setEcts(int ects) {
		assert ects >= 0 : "Invalid ects";
		this.ects = ects;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param a
	 ***********************************************************/
	public void efectuaMatricula(Aluno a) {
		assert a != null : "Invalid aluno";
		assert a.perfis().contains(this) : "O aluno já se encontra matriculado neste perfil";

		Matricula.objectos().add(new Matricula(a, this, CalendarDate.today()));

		assert a.perfis().contains(this) : "A operacao nao foi bem sucedida";

	}

	/***********************************************************
	 * @return the curso
	 ***********************************************************/
	public Curso getCurso() {
		return curso;
	}

	/***********************************************************
	 * @param curso
	 *            the curso to set
	 ***********************************************************/
	public void setCurso(Curso curso) {
		assert curso != null : "Invalid curso";
		this.curso = curso;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Perfil [nome=" + nome + ", ects=" + ects + ", curso="
				+ curso.getNome() + "]";
	}

}

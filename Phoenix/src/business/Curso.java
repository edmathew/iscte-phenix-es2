package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Curso.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Curso {
	private static Set<Curso> cursos = new HashSet<Curso>(100);

	private String nome;
	private int numerusClausus;
	private Professor coordenador;
	private Professor coordenadorErasmus;
	private Set<Professor> comissaoCientifica = new HashSet<Professor>();

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0 && numerusClausus >= 0
				&& coordenador != null && coordenadorErasmus != null
				&& comissaoCientifica != null;
	}

	/***********************************************************
	 * @return the cursos
	 ***********************************************************/
	public static Set<Curso> objectos() {
		return cursos;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		cursos.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Perfil> perfis() {
		Set<Perfil> result = new HashSet<Perfil>();
		for (Perfil p : Perfil.objectos())
			if (p.getCurso() == this)
				result.add(p);
		return result;
	}

	/***********************************************************
      * 
      ***********************************************************/
	public Curso() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
		cursos.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param numerusClausus
	 * @param coordenador
	 * @param coordenadorErasmus
	 * @param comissaoCientifica
	 ***********************************************************/
	public Curso(String nome, int numerusClausus, Professor coordenador,
			Professor coordenadorErasmus, Set<Professor> comissaoCientifica) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		assert numerusClausus >= 0 : "Invalid numerusClausus";
		assert coordenador != null : "Invalid coordenador";
		assert coordenadorErasmus != null :"Invalid coordenadorErasmus";
		assert comissaoCientifica != null: "Invalid comissaoCientifica";
		
		this.nome = nome;
		this.numerusClausus = numerusClausus;
		this.coordenador = coordenador;
		this.coordenadorErasmus = coordenadorErasmus;
		this.comissaoCientifica = comissaoCientifica;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		cursos.add(this);
	}

	/***********************************************************
	 * @return the nome
	 ***********************************************************/
	public String getNome() {
		return nome;
	}

	/***********************************************************
	 * @return the numerusClausus
	 ***********************************************************/
	public int getNumerusClausus() {
		return numerusClausus;
	}

	/***********************************************************
	 * @param nome
	 *            the nome to set
	 ***********************************************************/
	public void setNome(String nome) {
		assert nome != null && nome.length() > 0: "Invalid nome";
		this.nome = nome;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param numerusClausus
	 *            the numerusClausus to set
	 ***********************************************************/
	public void setNumerusClausus(int numerusClausus) {
		assert numerusClausus >= 0 : "Invalid numerusClausus";
		this.numerusClausus = numerusClausus;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @return the coordenador
	 ***********************************************************/
	public Professor getCoordenador() {
		return coordenador;
	}

	/***********************************************************
	 * @return the coordenadorErasmus
	 ***********************************************************/
	public Professor getCoordenadorErasmus() {
		return coordenadorErasmus;
	}

	/***********************************************************
	 * @return the comissaoCientifica
	 ***********************************************************/
	public Set<Professor> getComissaoCientifica() {
		return comissaoCientifica;
	}

	/***********************************************************
	 * @param coordenador
	 *            the coordenador to set
	 ***********************************************************/
	public void setCoordenador(Professor coordenador) {
		assert coordenador != null : "Invalid coordenador";
		this.coordenador = coordenador;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param coordenadorErasmus
	 *            the coordenadorErasmus to set
	 ***********************************************************/
	public void setCoordenadorErasmus(Professor coordenadorErasmus) {
		assert coordenadorErasmus != null : "Invalid coordenadorErasmus";
		this.coordenadorErasmus = coordenadorErasmus;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param p
	 ***********************************************************/
	public void addComissaoCientifica(Professor p) {
		assert p != null: "Invalid professor";
		this.comissaoCientifica.add(p);
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", numerusClausus=" + numerusClausus
				+ "]";
	}

}
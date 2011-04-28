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
		return checkInvariant_Nome() && checkInvariant_NumerusClausus()
				&& checkInvariant_Coordenador()
				&& checkInvariant_CoordenadorErasmus()
				&& checkInvariant_ComissaoCientifica();
	}

	private boolean checkInvariant_Nome() {
		return nome != null && nome.length() > 0;
	}

	private boolean checkInvariant_NumerusClausus() {
		return numerusClausus >= 0;
	}

	private boolean checkInvariant_Coordenador() {
		return coordenador != null;
	}

	private boolean checkInvariant_CoordenadorErasmus() {
		return coordenadorErasmus != null;
	}

	private boolean checkInvariant_ComissaoCientifica() {
		return comissaoCientifica != null;
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
		assert coordenadorErasmus != null : "Invalid coordenadorErasmus";
		assert comissaoCientifica != null : "Invalid comissaoCientifica";

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
		assert nome != null && nome.length() > 0 : "Invalid nome";
		this.nome = nome;
		assert checkInvariant_Nome() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param numerusClausus
	 *            the numerusClausus to set
	 ***********************************************************/
	public void setNumerusClausus(int numerusClausus) {
		assert numerusClausus >= 0 : "Invalid numerusClausus";
		this.numerusClausus = numerusClausus;
		assert checkInvariant_NumerusClausus() : "Class Invariant isn't satisfied";
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
		assert checkInvariant_Coordenador() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param coordenadorErasmus
	 *            the coordenadorErasmus to set
	 ***********************************************************/
	public void setCoordenadorErasmus(Professor coordenadorErasmus) {
		assert coordenadorErasmus != null : "Invalid coordenadorErasmus";
		this.coordenadorErasmus = coordenadorErasmus;
		assert checkInvariant_CoordenadorErasmus() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param p
	 ***********************************************************/
	public void addComissaoCientifica(Professor p) {
		assert p != null : "Invalid professor";
		this.comissaoCientifica.add(p);
		assert checkInvariant_ComissaoCientifica() : "Class Invariant isn't satisfied";
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", numerusClausus=" + numerusClausus
				+ "]";
	}

}
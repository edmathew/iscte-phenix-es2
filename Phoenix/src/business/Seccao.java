package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Seccao.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Seccao {
	private static Set<Seccao> seccoes = new HashSet<Seccao>(60);

	private String nome;
	private Departamento departamento;

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0 && departamento != null;
	}

	/***********************************************************
	 * @return the seccoes
	 ***********************************************************/
	public static Set<Seccao> objectos() {
		return seccoes;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		seccoes.clear();
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Seccao() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
		seccoes.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param departamento
	 ***********************************************************/
	public Seccao(String nome, Departamento departamento) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		assert departamento != null : "Invalid departamento";

		this.nome = nome;
		this.departamento = departamento;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		seccoes.add(this);
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
	 * @return the departamento
	 ***********************************************************/
	public Departamento getDepartamento() {
		return departamento;
	}

	/***********************************************************
	 * @param departamento
	 *            the departamento to set
	 ***********************************************************/
	public void setDepartamento(Departamento departamento) {
		assert departamento != null : "Invalid departamento";
		this.departamento = departamento;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seccao [nome=" + nome + ", departamento="
				+ departamento.getNome() + "]";
	}

}

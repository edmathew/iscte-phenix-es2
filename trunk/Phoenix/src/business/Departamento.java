package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Departamento.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Departamento {
	private static Set<Departamento> departamentos = new HashSet<Departamento>(
			20);

	private String nome;

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0;
	}

	/***********************************************************
	 * @return the departamentos
	 ***********************************************************/
	public static Set<Departamento> objectos() {
		return departamentos;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		departamentos.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Seccao> seccoes() {
		Set<Seccao> result = new HashSet<Seccao>();
		for (Seccao s : Seccao.objectos())
			if (s.getDepartamento() == this)
				result.add(s);
		return result;
	}

	/***********************************************************
      * 
      ***********************************************************/
	public Departamento() {
		super();
		departamentos.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param numerusClausus
	 ***********************************************************/
	public Departamento(String nome) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		this.nome = nome;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		departamentos.add(this);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}

}
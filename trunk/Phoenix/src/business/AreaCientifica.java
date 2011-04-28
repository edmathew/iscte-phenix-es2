package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: AreaCientifica.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class AreaCientifica {

	private static Set<AreaCientifica> areasCientificas = new HashSet<AreaCientifica>(
			50);

	private String nome;

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0;
	}

	/***********************************************************
	 * @return the areasCientificas
	 ***********************************************************/
	public static Set<AreaCientifica> objectos() {
		return areasCientificas;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		areasCientificas.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> disciplinas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Disciplina d : Disciplina.objectos())
			if (d.getAreaCientifica() == this)
				result.add(d);
		return result;
	}

	/***********************************************************
      * 
      ***********************************************************/
	public AreaCientifica() {
		super();
		areasCientificas.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param numerusClausus
	 ***********************************************************/
	public AreaCientifica(String nome) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		this.nome = nome;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		areasCientificas.add(this);
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
		assert nome != null && nome.length() > 0 : "Invalid nome";
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
		return "AreaCientifica [nome=" + nome + "]";
	}

}

package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Oferta.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Oferta {
	public enum Semestre {
		impar, par
	}

	private static Set<Oferta> ofertas = new HashSet<Oferta>(3000);

	private Disciplina disciplina;
	private Perfil perfil;

	private int ects;
	private Semestre semestre;
	private int ano;
	private boolean obrigatoria;
	private int vagas;

	private boolean checkInvariants() {
		return checkInvariant_Ano() && checkInvariant_Disciplina()
				&& checkInvariant_Ects() && checkInvariant_Perfil()
				&& checkInvariant_Semestre() && checkInvariant_Vagas();
	}

	private boolean checkInvariant_Disciplina() {
		return disciplina != null;
	}

	private boolean checkInvariant_Perfil() {
		return perfil != null;
	}

	private boolean checkInvariant_Ects() {
		return ects >= 0;
	}

	private boolean checkInvariant_Semestre() {
		return semestre != null;
	}

	private boolean checkInvariant_Ano() {
		return ano > 0;
	}

	private boolean checkInvariant_Vagas() {
		return vagas >= 0;
	}

	/***********************************************************
	 * @return the ofertas
	 ***********************************************************/
	public static Set<Oferta> objectos() {
		return ofertas;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		ofertas.clear();
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Oferta() {
		super();
		ofertas.add(this);
	}

	/***********************************************************
	 * @param disciplina
	 * @param perfil
	 * @param ects
	 * @param semestre
	 * @param ano
	 * @param obrigatoria
	 ***********************************************************/
	public Oferta(Disciplina disciplina, Perfil perfil, int ects,
			Semestre semestre, int ano, boolean obrigatoria) {
		assert disciplina != null : "Invalid disciplina";
		assert perfil != null : "Invalid perfil";
		assert ects >= 0 : "Invalid ects";
		assert semestre != null : "Invalid semestre";
		assert ano > 0 : "Invalid ano";

		this.disciplina = disciplina;
		this.perfil = perfil;
		this.ects = ects;
		this.semestre = semestre;
		this.ano = ano;
		this.obrigatoria = obrigatoria;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		ofertas.add(this);
	}

	/***********************************************************
	 * @return the disciplina
	 ***********************************************************/
	public Disciplina getDisciplina() {
		return disciplina;
	}

	/***********************************************************
	 * @return the perfil
	 ***********************************************************/
	public Perfil getPerfil() {
		return perfil;
	}

	/***********************************************************
	 * @return the ects
	 ***********************************************************/
	public int getEcts() {
		return ects;
	}

	/***********************************************************
	 * @return the semestre
	 ***********************************************************/
	public Semestre getSemestre() {
		return semestre;
	}

	/***********************************************************
	 * @return the ano
	 ***********************************************************/
	public int getAno() {
		return ano;
	}

	/***********************************************************
	 * @return the obrigatoria
	 ***********************************************************/
	public boolean isObrigatoria() {
		return obrigatoria;
	}

	/***********************************************************
	 * @param disciplina
	 *            the disciplina to set
	 ***********************************************************/
	public void setDisciplina(Disciplina disciplina) {
		assert disciplina != null : "Invalid disciplina";
		this.disciplina = disciplina;
		assert checkInvariant_Disciplina() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param perfil
	 *            the perfil to set
	 ***********************************************************/
	public void setPerfil(Perfil perfil) {
		assert perfil != null;
		this.perfil = perfil;
		assert checkInvariant_Perfil() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param ects
	 *            the ects to set
	 ***********************************************************/
	public void setEcts(int ects) {
		assert ects >= 0 : "Invalid ects";
		this.ects = ects;
		assert checkInvariant_Ects() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param semestre
	 *            the semestre to set
	 ***********************************************************/
	public void setSemestre(Semestre semestre) {
		assert semestre != null : "Invalid semestre";
		this.semestre = semestre;
		assert checkInvariant_Semestre() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param ano
	 *            the ano to set
	 ***********************************************************/
	public void setAno(int ano) {
		assert ano > 0 : "Invalid ano";
		this.ano = ano;
		assert checkInvariant_Ano() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param obrigatoria
	 *            the obrigatoria to set
	 ***********************************************************/
	public void setObrigatoria(boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}

	/***********************************************************
	 * @return the vagas
	 ***********************************************************/
	public int getVagas() {
		return vagas;
	}

	/***********************************************************
	 * @param vagas
	 *            the vagas to set
	 ***********************************************************/
	public void setVagas(int vagas) {
		assert vagas >= 0 : "Invalid vagas";
		this.vagas = vagas;
		assert checkInvariant_Vagas() : "Class Invariant isn't satisfied";
	}

	@Override
	public String toString() {
		return "Oferta [disciplina=" + disciplina.getNome() + ", perfil="
				+ perfil.getNome() + ", ects=" + ects + ", semestre="
				+ semestre + ", ano=" + ano + ", obrigatoria=" + obrigatoria
				+ ", vagas=" + vagas + "]";
	}

}

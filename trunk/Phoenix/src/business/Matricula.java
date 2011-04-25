package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Matricula.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Matricula {
	private static Set<Matricula> matriculas = new HashSet<Matricula>(12000);

	private Aluno aluno;
	private Perfil perfil;

	CalendarDate dataInscricao;
	Boolean paga = false;
	
	private boolean checkInvariants(){
		return aluno != null && perfil != null && dataInscricao != null;
	}

	/***********************************************************
	 * @return the matriculas
	 ***********************************************************/
	public static Set<Matricula> objectos() {
		return matriculas;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		matriculas.clear();
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Matricula() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
		matriculas.add(this);
	}

	/***********************************************************
	 * @param aluno
	 * @param perfil
	 * @param dataInscricao
	 ***********************************************************/
	public Matricula(Aluno aluno, Perfil perfil, CalendarDate dataInscricao) {
		assert aluno != null : "Invalid aluno";
		assert perfil != null: "Invalid perfil";
		assert dataInscricao != null: "Invalid dataInscricao";
		
		this.aluno = aluno;
		this.perfil = perfil;
		this.dataInscricao = dataInscricao;
		
		assert checkInvariants() : "Class Invariant isn't satisfied";
		matriculas.add(this);
	}
	

	/***********************************************************
	 * @return the aluno
	 ***********************************************************/
	public Aluno getAluno() {
		return aluno;
	}

	/***********************************************************
	 * @return the perfil
	 ***********************************************************/
	public Perfil getPerfil() {
		return perfil;
	}

	/***********************************************************
	 * @return the dataInscricao
	 ***********************************************************/
	public CalendarDate getDataInscricao() {
		return dataInscricao;
	}

	/***********************************************************
	 * @return the paga
	 ***********************************************************/
	public Boolean getPaga() {
		return paga;
	}

	/***********************************************************
	 * @param aluno
	 *            the aluno to set
	 ***********************************************************/
	public void setAluno(Aluno aluno) {
		assert aluno != null : "Invalid aluno";
		this.aluno = aluno;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param perfil
	 *            the perfil to set
	 ***********************************************************/
	public void setPerfil(Perfil perfil) {
		assert perfil != null: "Invalid perfil";
		this.perfil = perfil;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param dataInscricao
	 *            the dataInscricao to set
	 ***********************************************************/
	public void setDataInscricao(CalendarDate dataInscricao) {
		assert dataInscricao != null : "Invalid dataInscricao";
		this.dataInscricao = dataInscricao;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param paga
	 *            the paga to set
	 ***********************************************************/
	public void setPaga(Boolean paga) {
		this.paga = paga;
	}

	/***********************************************************
	* 
	***********************************************************/
	void pagar() {
		paga = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Matricula [aluno=" + aluno.getNumero() + ", perfil="
				+ perfil.getNome() + ", dataInscricao=" + dataInscricao
				+ ", paga=" + paga + "]";
	}
}

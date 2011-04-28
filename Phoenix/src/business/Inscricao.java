package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Inscricao.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Inscricao {
	private static Set<Inscricao> inscricoes = new HashSet<Inscricao>(50000);

	private Aluno aluno;
	private Disciplina disciplina;

	private CalendarDate dataInscricao;
	private CalendarDate dataResultado;
	private int resultado;

	private boolean checkInvariants() {
		return checkInvariant_Aluno()
				&& checkInvariant_DataInscricao()
				&& checkInvariant_Disciplina()
				&& (dataResultado == null || checkInvariant_DataResultadoDefined());
		// return aluno != null
		// && disciplina != null
		// && dataInscricao != null
		// && (dataResultado == null || (dataResultado != null
		// && dataResultado.isAfter(dataInscricao) && resultado >= 0));
	}

	private boolean checkInvariant_Aluno() {
		return aluno != null;
	}

	private boolean checkInvariant_Disciplina() {
		return disciplina != null;
	}

	private boolean checkInvariant_DataInscricao() {
		return dataInscricao != null;
	}

	private boolean checkInvariant_DataResultadoDefined() {
		return dataResultado != null && dataResultado.isAfter(dataInscricao)
				&& resultado >= 0;
	}

	/***********************************************************
	 * @return the inscricoes
	 ***********************************************************/
	public static Set<Inscricao> objectos() {
		return inscricoes;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		inscricoes.clear();
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Inscricao() {
		super();
		inscricoes.add(this);
	}

	/***********************************************************
	 * @param aluno
	 * @param disciplina
	 * @param dataInscricao
	 * @param dataResultado
	 * @param resultado
	 ***********************************************************/
	public Inscricao(Aluno aluno, Disciplina disciplina,
			CalendarDate dataInscricao, CalendarDate dataResultado,
			int resultado) {
		assert aluno != null : "Invalid aluno";
		assert disciplina != null : "Invalid disciplina";
		assert dataInscricao != null : "Invalid dataInscricao";
		if (dataResultado != null) {
			assert dataResultado.isAfter(dataInscricao) : "Invalid dataResultado";
			assert resultado >= 0 : "Invalid resultado";
		}

		this.aluno = aluno;
		this.disciplina = disciplina;
		this.dataInscricao = dataInscricao;
		this.dataResultado = dataResultado;
		this.resultado = resultado;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		inscricoes.add(this);
	}

	/***********************************************************
	 * @return the aluno
	 ***********************************************************/
	public Aluno getAluno() {
		return aluno;
	}

	/***********************************************************
	 * @return the disciplina
	 ***********************************************************/
	public Disciplina getDisciplina() {
		return disciplina;
	}

	/***********************************************************
	 * @return the dataInscricao
	 ***********************************************************/
	public CalendarDate getDataInscricao() {
		return dataInscricao;
	}

	/***********************************************************
	 * @return the dataResultado
	 ***********************************************************/
	public CalendarDate getDataResultado() {
		return dataResultado;
	}

	/***********************************************************
	 * @return the resultado
	 ***********************************************************/
	public int getResultado() {
		return resultado;
	}

	/***********************************************************
	 * @param aluno
	 *            the aluno to set
	 ***********************************************************/
	public void setAluno(Aluno aluno) {
		assert aluno != null : "Invalid aluno";
		this.aluno = aluno;
		assert checkInvariant_Aluno() : "Class Invariant isn't satisfied";
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
	 * @param dataInscricao
	 *            the dataInscricao to set
	 ***********************************************************/
	public void setDataInscricao(CalendarDate dataInscricao) {
		assert dataInscricao != null : "Invalid dataIncricao";
		this.dataInscricao = dataInscricao;
		assert checkInvariant_DataInscricao() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param dataResultado
	 *            the dataResultado to set
	 ***********************************************************/
	public void setDataResultado(CalendarDate dataResultado) {
		assert dataResultado != null && dataResultado.isAfter(dataInscricao) : "Invalid dataResultado";
		this.dataResultado = dataResultado;
		assert checkInvariant_DataResultadoDefined() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param resultado
	 *            the resultado to set
	 ***********************************************************/
	public void setResultado(int resultado) {
		assert resultado >= 0;
		this.resultado = resultado;
	}

	public boolean notaLancada() {
		return dataResultado != null;
	}

	@Override
	public String toString() {
		return "Inscricao [aluno=" + aluno.getNumero() + ", disciplina="
				+ disciplina.getNome() + ", dataInscricao=" + dataInscricao
				+ ", dataResultado=" + dataResultado + ", resultado="
				+ resultado + "]";
	}

}
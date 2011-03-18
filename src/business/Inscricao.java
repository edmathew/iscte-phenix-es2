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
public class Inscricao
{
    private static Set<Inscricao> inscricoes = new HashSet<Inscricao>(50000);

    private Aluno aluno;
    private Disciplina disciplina;

    private CalendarDate dataInscricao;
    private CalendarDate dataResultado;
    private int resultado;

    /***********************************************************
     * @return the inscricoes
     ***********************************************************/
    public static Set<Inscricao> objectos()
    {
	return inscricoes;
    }

    /***********************************************************
     * 
     ***********************************************************/
     public Inscricao()
     {
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
    public Inscricao(Aluno aluno, Disciplina disciplina, CalendarDate dataInscricao,
	    CalendarDate dataResultado, int resultado)
    {
	this.aluno = aluno;
	this.disciplina = disciplina;
	this.dataInscricao = dataInscricao;
	this.dataResultado = dataResultado;
	this.resultado = resultado;
	
	inscricoes.add(this);
    }

    /***********************************************************
     * @return the aluno
     ***********************************************************/
    public Aluno getAluno()
    {
	return aluno;
    }

    /***********************************************************
     * @return the disciplina
     ***********************************************************/
    public Disciplina getDisciplina()
    {
	return disciplina;
    }

    /***********************************************************
     * @return the dataInscricao
     ***********************************************************/
    public CalendarDate getDataInscricao()
    {
	return dataInscricao;
    }

    /***********************************************************
     * @return the dataResultado
     ***********************************************************/
    public CalendarDate getDataResultado()
    {
	return dataResultado;
    }

    /***********************************************************
     * @return the resultado
     ***********************************************************/
    public int getResultado()
    {
	return resultado;
    }

    /***********************************************************
     * @param aluno
     *            the aluno to set
     ***********************************************************/
    public void setAluno(Aluno aluno)
    {
	this.aluno = aluno;
    }

    /***********************************************************
     * @param disciplina
     *            the disciplina to set
     ***********************************************************/
    public void setDisciplina(Disciplina disciplina)
    {
	this.disciplina = disciplina;
    }

    /***********************************************************
     * @param dataInscricao
     *            the dataInscricao to set
     ***********************************************************/
    public void setDataInscricao(CalendarDate dataInscricao)
    {
	this.dataInscricao = dataInscricao;
    }

    /***********************************************************
     * @param dataResultado
     *            the dataResultado to set
     ***********************************************************/
    public void setDataResultado(CalendarDate dataResultado)
    {
	this.dataResultado = dataResultado;
    }

    /***********************************************************
     * @param resultado
     *            the resultado to set
     ***********************************************************/
    public void setResultado(int resultado)
    {
	this.resultado = resultado;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Inscricao [aluno=" + aluno.getNumero() + ", disciplina=" + disciplina.getNome() + ", dataInscricao=" + dataInscricao
		+ ", dataResultado=" + dataResultado + ", resultado=" + resultado + "]";
    }

}
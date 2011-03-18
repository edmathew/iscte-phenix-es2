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
public class Seccao
{
    private static Set<Seccao> seccoes = new HashSet<Seccao>(60);

    private String nome;
    private Departamento departamento;

    /***********************************************************
     * @return the seccoes
     ***********************************************************/
    public static Set<Seccao> objectos()
    {
	return seccoes;
    }

    /***********************************************************
     * 
     ***********************************************************/
     public Seccao()
     {
 	super();
	seccoes.add(this);
     }
     
    /***********************************************************
     * @param nome
     * @param departamento
     ***********************************************************/
    public Seccao(String nome, Departamento departamento)
    {
	this.nome = nome;
	this.departamento = departamento;
	
	seccoes.add(this);
    }

    /***********************************************************
     * @return the nome
     ***********************************************************/
    public String getNome()
    {
	return nome;
    }

    /***********************************************************
     * @param nome
     *            the nome to set
     ***********************************************************/
    public void setNome(String nome)
    {
	this.nome = nome;
    }

    /***********************************************************
     * @return the departamento
     ***********************************************************/
    public Departamento getDepartamento()
    {
	return departamento;
    }

    /***********************************************************
     * @param departamento
     *            the departamento to set
     ***********************************************************/
    public void setDepartamento(Departamento departamento)
    {
	this.departamento = departamento;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Seccao [nome=" + nome + ", departamento=" + departamento.getNome() + "]";
    }

}

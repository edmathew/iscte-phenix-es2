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
public class Departamento
{
    private static Set<Departamento> departamentos = new HashSet<Departamento>(20);

    private String nome;

    /***********************************************************
     * @return the departamentos
     ***********************************************************/
    public static Set<Departamento> objectos()
    {
	return departamentos;
    }

    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Seccao> seccoes()
     {
 	Set<Seccao> result = new HashSet<Seccao>();
 	for (Seccao s: Seccao.objectos())
 	    if (s.getDepartamento()==this)
 		result.add(s);
 	return result;
     }
     
     /***********************************************************
      * 
      ***********************************************************/
      public Departamento()
      {
  	super();
	departamentos.add(this);
      }
      
    /***********************************************************
     * @param nome
     * @param numerusClausus
     ***********************************************************/
    public Departamento(String nome)
    {
	this.nome = nome;
	
	departamentos.add(this);
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Departamento [nome=" + nome + "]";
    }

}
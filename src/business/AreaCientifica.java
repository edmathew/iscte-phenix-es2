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
public class AreaCientifica
{

    private static Set<AreaCientifica> areasCientificas = new HashSet<AreaCientifica>(50);

    private String nome;

    /***********************************************************
     * @return the areasCientificas
     ***********************************************************/
    public static Set<AreaCientifica> objectos()
    {
	return areasCientificas;
    }
     
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Disciplina> disciplinas()
     {
 	Set<Disciplina> result = new HashSet<Disciplina>();
 	for (Disciplina d: Disciplina.objectos())
 	    if (d.getAreaCientifica()==this)
 		result.add(d);
 	return result;
     }
     
     /***********************************************************
      * 
      ***********************************************************/
      public AreaCientifica()
      {
  	super();
	areasCientificas.add(this);
      }
      
    /***********************************************************
     * @param nome
     * @param numerusClausus
     ***********************************************************/
    public AreaCientifica(String nome)
    {
	this.nome = nome;
	
	areasCientificas.add(this);
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
	return "AreaCientifica [nome=" + nome + "]";
    }

}

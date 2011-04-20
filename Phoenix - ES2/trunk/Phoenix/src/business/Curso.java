package business;
import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Curso.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Curso
{
    private static Set<Curso> cursos = new HashSet<Curso>(100);

    private String nome;
    private int numerusClausus;
    private Professor coordenador;
    private Professor coordenadorErasmus;
    private Set<Professor> comissaoCientifica = new HashSet<Professor>();

    /***********************************************************
     * @return the cursos
     ***********************************************************/
    public static Set<Curso> objectos()
    {
	return cursos;
    }
    
    /***********************************************************
     * 
     ***********************************************************/
     public static void reset()
     {
	 cursos.clear();
     }
     
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Perfil> perfis()
     {
 	Set<Perfil> result = new HashSet<Perfil>();
 	for (Perfil p: Perfil.objectos())
 	    if (p.getCurso()==this)
 		result.add(p);
 	return result;
     }

     /***********************************************************
      * 
      ***********************************************************/
      public Curso()
      {
  	super();
	cursos.add(this);
      }
      
    /***********************************************************
     * @param nome
     * @param numerusClausus
     * @param coordenador
     * @param coordenadorErasmus
     * @param comissaoCientifica
     ***********************************************************/
    public Curso(String nome, int numerusClausus, Professor coordenador,
	    Professor coordenadorErasmus, Set<Professor> comissaoCientifica)
    {
	this.nome = nome;
	this.numerusClausus = numerusClausus;
	this.coordenador = coordenador;
	this.coordenadorErasmus = coordenadorErasmus;
	this.comissaoCientifica = comissaoCientifica;
	
	cursos.add(this);
    }

    /***********************************************************
     * @return the nome
     ***********************************************************/
    public String getNome()
    {
	return nome;
    }

    /***********************************************************
     * @return the numerusClausus
     ***********************************************************/
    public int getNumerusClausus()
    {
	return numerusClausus;
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
     * @param numerusClausus
     *            the numerusClausus to set
     ***********************************************************/
    public void setNumerusClausus(int numerusClausus)
    {
	this.numerusClausus = numerusClausus;
    }

    /***********************************************************
     * @return the coordenador
     ***********************************************************/
    public Professor getCoordenador()
    {
	return coordenador;
    }

    /***********************************************************
     * @return the coordenadorErasmus
     ***********************************************************/
    public Professor getCoordenadorErasmus()
    {
	return coordenadorErasmus;
    }

    /***********************************************************
     * @return the comissaoCientifica
     ***********************************************************/
    public Set<Professor> getComissaoCientifica()
    {
	return comissaoCientifica;
    }

    /***********************************************************
     * @param coordenador
     *            the coordenador to set
     ***********************************************************/
    public void setCoordenador(Professor coordenador)
    {
	this.coordenador = coordenador;
    }

    /***********************************************************
     * @param coordenadorErasmus
     *            the coordenadorErasmus to set
     ***********************************************************/
    public void setCoordenadorErasmus(Professor coordenadorErasmus)
    {
	this.coordenadorErasmus = coordenadorErasmus;
    }

    /***********************************************************
    * @param p
    ***********************************************************/
    public void addComissaoCientifica(Professor p)
    {
	this.comissaoCientifica.add(p);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Curso [nome=" + nome + ", numerusClausus=" + numerusClausus + "]";
    }

}
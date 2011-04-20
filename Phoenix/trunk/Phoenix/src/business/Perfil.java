package business;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/***********************************************************
 * Filename: Perfil.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Perfil
{
    private static Set<Perfil> perfis = new HashSet<Perfil>(250);

    private String nome;
    private int ects;
    
    private Curso curso;
    

    /***********************************************************
     * @return the perfis
     ***********************************************************/
    public static Set<Perfil> objectos()
    {
	return perfis;
    }
    
    /***********************************************************
     * 
     ***********************************************************/
     public static void reset()
     {
	 perfis.clear();
     }
     
    
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Matricula> matriculas()
     {
 	Set<Matricula> result = new HashSet<Matricula>();
 	for (Matricula m: Matricula.objectos())
 	    if (m.getPerfil()==this)
 		result.add(m);
 	return result;
     }
     
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Aluno> alunos()
     {
 	Set<Aluno> result = new HashSet<Aluno>();
 	for (Matricula m: matriculas())
 		result.add(m.getAluno());
 	return result;
     }

     /***********************************************************
      * @return
      ***********************************************************/
      public Set<Oferta> ofertas()
      {
  	Set<Oferta> result = new HashSet<Oferta>();
  	for (Oferta o: Oferta.objectos())
  	    if (o.getPerfil()==this)
  		result.add(o);
  	return result;
      }
      
     /***********************************************************
      * @return
      ***********************************************************/
      public Set<Disciplina> disciplinas()
      {
  	Set<Disciplina> result = new HashSet<Disciplina>();
  	for (Oferta o: ofertas())
  		result.add(o.getDisciplina());
  	return result;
      }
      
      /***********************************************************
       * 
       ***********************************************************/
       public Perfil()
       {
   	super();
	perfis.add(this);
       }
       
    /***********************************************************
     * @param nome
     * @param curso
     ***********************************************************/
    public Perfil(String nome, int ects, Curso curso)
    {
	this.nome = nome;
	this.ects = ects;
	this.curso = curso;
	
	perfis.add(this);
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
     * @return the ects
     ***********************************************************/
    public int getEcts()
    {
        return ects;
    }

    /***********************************************************
     * @param ects the ects to set
     ***********************************************************/
    public void setEcts(int ects)
    {
        this.ects = ects;
    }

    /***********************************************************
     * @param a
     ***********************************************************/
    public void efectuaMatricula(Aluno a)
    {

    }

    /***********************************************************
     * @return the curso
     ***********************************************************/
    public Curso getCurso()
    {
	return curso;
    }

    /***********************************************************
     * @param curso
     *            the curso to set
     ***********************************************************/
    public void setCurso(Curso curso)
    {
	this.curso = curso;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Perfil [nome=" + nome + ", ects=" + ects + ", curso=" + curso.getNome() + "]";
    }

}

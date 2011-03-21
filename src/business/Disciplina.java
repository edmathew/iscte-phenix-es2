package business;
import java.util.HashSet;
import java.util.Set;


/***********************************************************
 * Filename: Disciplina.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public class Disciplina
{
    private static Set<Disciplina> disciplinas = new HashSet<Disciplina>(1000);

    private String nome;

    private AreaCientifica areaCientifica;
    private Professor regente;
    private Set<Professor> equipaDocente = new HashSet<Professor>();
    private Set<Disciplina> precedentes = new HashSet<Disciplina>();
    
    
    /***********************************************************
     * @return the disciplinas
     ***********************************************************/
    public static Set<Disciplina> objectos()
    {
	return disciplinas;
    }
    
    /***********************************************************
     * 
     ***********************************************************/
     public static void reset()
     {
	 disciplinas.clear();
     }
    
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Inscricao> inscricoes()
     {
 	Set<Inscricao> result = new HashSet<Inscricao>();
 	for (Inscricao i: Inscricao.objectos())
 	    if (i.getDisciplina()==this)
 		result.add(i);
 	return result;
     }
     
    /***********************************************************
     * @return
     ***********************************************************/
     public Set<Aluno> alunos()
     {
 	Set<Aluno> result = new HashSet<Aluno>();
 	for (Inscricao i: inscricoes())
 		result.add(i.getAluno());
 	return result;
     }
     
     /***********************************************************
      * @return
      ***********************************************************/
      public Set<Oferta> ofertas()
      {
  	Set<Oferta> result = new HashSet<Oferta>();
  	for (Oferta o: Oferta.objectos())
  	    if (o.getDisciplina()==this)
  		result.add(o);
  	return result;
      }
      
     /***********************************************************
      * @return
      ***********************************************************/
      public Set<Perfil> perfis()
      {
  	Set<Perfil> result = new HashSet<Perfil>();
  	for (Oferta o: ofertas())
  		result.add(o.getPerfil());
  	return result;
      }

      /***********************************************************
       * @return
       ***********************************************************/
      public Set<Disciplina> seguintes()
      {
  	Set<Disciplina> result = new HashSet<Disciplina>();
  	for (Disciplina d: Disciplina.objectos())
  	    if (d.getPrecedentes().contains(this))
  		result.add(d);
  	return result;
      }

      /***********************************************************
       * 
       ***********************************************************/
       public Disciplina()
       {
   	super();
	disciplinas.add(this);
       }
       
    /***********************************************************
     * @param nome
     * @param precedentes
     * @param areaCientifica
     * @param regente
     * @param equipaDocente
     ***********************************************************/
    public Disciplina(String nome, Set<Disciplina> precedentes,  AreaCientifica areaCientifica, Professor regente, Set<Professor> equipaDocente)
    {
	this.nome = nome;
	this.precedentes = precedentes;
	this.areaCientifica = areaCientifica;
	this.regente = regente;
	this.equipaDocente = equipaDocente;
	
	disciplinas.add(this);
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
     * @param a
     ***********************************************************/
    public void efectuaInscricao(Aluno a)
    {
	
    }

    /***********************************************************
     * @return the precedentes
     ***********************************************************/
    public Set<Disciplina> getPrecedentes()
    {
	return precedentes;
    }

    public void addPrecedentes(Disciplina d)
    {
	this.precedentes.add(d);
    }

    /***********************************************************
     * @return the areaCientifica
     ***********************************************************/
    public AreaCientifica getAreaCientifica()
    {
	return areaCientifica;
    }

    /***********************************************************
     * @return the regente
     ***********************************************************/
    public Professor getRegente()
    {
	return regente;
    }

    /***********************************************************
     * @return the equipaDocente
     ***********************************************************/
    public Set<Professor> getEquipaDocente()
    {
	return equipaDocente;
    }

    /***********************************************************
     * @param areaCientifica
     *            the areaCientifica to set
     ***********************************************************/
    public void setAreaCientifica(AreaCientifica areaCientifica)
    {
	this.areaCientifica = areaCientifica;
    }

    /***********************************************************
     * @param regente
     *            the regente to set
     ***********************************************************/
    public void setRegente(Professor regente)
    {
	this.regente = regente;
    }

    public void addEquipaDocente(Professor p)
    {
	this.equipaDocente.add(p);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Disciplina [nome=" + nome + ", areaCientifica=" + areaCientifica.getNome() + ", regente=" + regente.getNome() + "]";
    }

}
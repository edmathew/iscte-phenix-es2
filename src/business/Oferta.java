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
public class Oferta
{
    public enum Semestre
    {
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

    /***********************************************************
     * @return the ofertas
     ***********************************************************/
    public static Set<Oferta> objectos()
    {
	return ofertas;
    }

    /***********************************************************
     * 
     ***********************************************************/
     public Oferta()
     {
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
	    Semestre semestre, int ano, boolean obrigatoria)
    {
	this.disciplina = disciplina;
	this.perfil = perfil;
	this.ects = ects;
	this.semestre = semestre;
	this.ano = ano;
	this.obrigatoria = obrigatoria;
	
	ofertas.add(this);
    }

    /***********************************************************
     * @return the disciplina
     ***********************************************************/
    public Disciplina getDisciplina()
    {
	return disciplina;
    }

    /***********************************************************
     * @return the perfil
     ***********************************************************/
    public Perfil getPerfil()
    {
	return perfil;
    }

    /***********************************************************
     * @return the ects
     ***********************************************************/
    public int getEcts()
    {
	return ects;
    }

    /***********************************************************
     * @return the semestre
     ***********************************************************/
    public Semestre getSemestre()
    {
	return semestre;
    }

    /***********************************************************
     * @return the ano
     ***********************************************************/
    public int getAno()
    {
	return ano;
    }

    /***********************************************************
     * @return the obrigatoria
     ***********************************************************/
    public boolean isObrigatoria()
    {
	return obrigatoria;
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
     * @param perfil
     *            the perfil to set
     ***********************************************************/
    public void setPerfil(Perfil perfil)
    {
	this.perfil = perfil;
    }

    /***********************************************************
     * @param ects
     *            the ects to set
     ***********************************************************/
    public void setEcts(int ects)
    {
	this.ects = ects;
    }

    /***********************************************************
     * @param semestre
     *            the semestre to set
     ***********************************************************/
    public void setSemestre(Semestre semestre)
    {
	this.semestre = semestre;
    }

    /***********************************************************
     * @param ano
     *            the ano to set
     ***********************************************************/
    public void setAno(int ano)
    {
	this.ano = ano;
    }

    /***********************************************************
     * @param obrigatoria
     *            the obrigatoria to set
     ***********************************************************/
    public void setObrigatoria(boolean obrigatoria)
    {
	this.obrigatoria = obrigatoria;
    }

    /***********************************************************
     * @return the vagas
     ***********************************************************/
    public int getVagas()
    {
        return vagas;
    }

    /***********************************************************
     * @param vagas the vagas to set
     ***********************************************************/
    public void setVagas(int vagas)
    {
        this.vagas = vagas;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Oferta [disciplina=" + disciplina.getNome() + ", perfil=" + perfil.getNome() + ", ects=" + ects + ", semestre=" + semestre
		+ ", ano=" + ano + ", obrigatoria=" + obrigatoria + ", vagas=" + vagas + "]";
    }

}

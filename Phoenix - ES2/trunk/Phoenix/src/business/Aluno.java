package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * @author fba
 * 14 de Mar de 2011
 *
 ***********************************************************/
/***********************************************************
 * @author fba 16 de Mar de 2011
 * 
 ***********************************************************/
public class Aluno extends Pessoa
{
    private static Set<Aluno> alunos = new HashSet<Aluno>(10000);

    private int numero;

    /***********************************************************
     * @return the alunos
     ***********************************************************/
    public static Set<Aluno> objectos()
    {
	return alunos;
    }
    
    /***********************************************************
    * 
    ***********************************************************/
    public static void reset()
    {
	alunos.clear();
    }

    /***********************************************************
    * 
    ***********************************************************/
    public Aluno()
    {
	super();
	alunos.add(this);
    }

    /***********************************************************
     * @param nome
     * @param dataNascimento
     * @param email
     * @param numero
     ***********************************************************/
    public Aluno(String nome, CalendarDate dataNascimento, String email, int numero)
    {
	super(nome, dataNascimento, email);
	this.numero = numero;

	alunos.add(this);
    }

    /***********************************************************
     * @return
     ***********************************************************/
    public Set<Inscricao> inscricoes()
    {
	Set<Inscricao> result = new HashSet<Inscricao>();
	for (Inscricao i : Inscricao.objectos())
	    if (i.getAluno() == this)
		result.add(i);
	return result;
    }

    /***********************************************************
     * @return
     ***********************************************************/
    public Set<Disciplina> disciplinas()
    {
	Set<Disciplina> result = new HashSet<Disciplina>();
	for (Inscricao i : inscricoes())
	    result.add(i.getDisciplina());
	return result;
    }

    /***********************************************************
     * @return
     ***********************************************************/
    public Set<Matricula> matriculas()
    {
	Set<Matricula> result = new HashSet<Matricula>();
	for (Matricula m : Matricula.objectos())
	    if (m.getAluno() == this)
		result.add(m);
	return result;
    }

    /***********************************************************
     * @return
     ***********************************************************/
    public Set<Perfil> perfis()
    {
	Set<Perfil> result = new HashSet<Perfil>();
	for (Matricula m : matriculas())
	    result.add(m.getPerfil());
	return result;
    }

    /***********************************************************
     * @return the numero
     ***********************************************************/
    public int getNumero()
    {
	return numero;
    }

    /***********************************************************
     * @param numero
     *            the numero to set
     ***********************************************************/
    public void setNumero(int numero)
    {
	this.numero = numero;
    }

    /***********************************************************
     * @param c
     * @return
     ***********************************************************/
    public int creditosObtidos(Curso c)
    {
	int result = 0;
	for (Oferta o : Oferta.objectos())
	    if (o.getPerfil().getCurso() == c && aprovadas().contains(o.getDisciplina()))
		result += o.getEcts();
	return result;
    }

    /***********************************************************
     * @return
     ***********************************************************/
    public Set<Disciplina> aprovadas()
    {
	Set<Disciplina> result = new HashSet<Disciplina>();
	for (Inscricao i : inscricoes())
	    if (i.getResultado() >= 10 && i.getResultado() <= 20)
		result.add(i.getDisciplina());
	return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Aluno [numero=" + numero + ", nome()=" + getNome() + ", email()=" + getEmail() + "]";
	// return "Aluno [numero=" + numero + ", inscricoes()=" + inscricoes() +
	// ", disciplinas()=" + disciplinas()
	// + ", matriculas()=" + matriculas() + ", perfis()=" + perfis() +
	// ", getNumero()=" + getNumero()
	// + ", aprovadas()=" + aprovadas() + ", getNome()=" + getNome() +
	// ", getDataNascimento()="
	// + getDataNascimento() + ", getEmail()=" + getEmail() + ", idade()=" +
	// idade() + "]";
    }

}

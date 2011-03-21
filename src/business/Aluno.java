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
public class Aluno extends Pessoa {
	private static Set<Aluno> alunos = new HashSet<Aluno>(10000);

	private int numero;

	/***********************************************************
	 * @return the alunos
	 ***********************************************************/
	public static Set<Aluno> objectos() {
		return alunos;
	}

	/***********************************************************
    * 
    ***********************************************************/
	public static void reset() {
		alunos.clear();
	}

	/***********************************************************
    * 
    ***********************************************************/
	public Aluno() {
		super();
		alunos.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param numero
	 * @throws IllegalArgumentException
	 *             caso o numero de aluno seja invalido
	 ***********************************************************/
	public Aluno(String nome, CalendarDate dataNascimento, String email,
			int numero) {
		super(nome, dataNascimento, email);
		if (numero < 0)
			throw new IllegalArgumentException("Numero de Aluno Invalido");
		this.numero = numero;

		alunos.add(this);
		assert this.numero >= 0 : "Numero de Aluno Invalido";
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Inscricao> inscricoes() {
		Set<Inscricao> result = new HashSet<Inscricao>();
		for (Inscricao i : Inscricao.objectos())
			if (i.getAluno() == this)
				result.add(i);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> disciplinas() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Inscricao i : inscricoes())
			result.add(i.getDisciplina());
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Matricula> matriculas() {
		Set<Matricula> result = new HashSet<Matricula>();
		for (Matricula m : Matricula.objectos())
			if (m.getAluno() == this)
				result.add(m);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Perfil> perfis() {
		Set<Perfil> result = new HashSet<Perfil>();
		for (Matricula m : matriculas())
			result.add(m.getPerfil());
		return result;
	}

	/***********************************************************
	 * @return the numero
	 ***********************************************************/
	public int getNumero() {
		return numero;
	}

	/***********************************************************
	 * @param numero
	 *            the numero to set
	 ***********************************************************/
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/***********************************************************
	 * Calcula os creditos obtidos pelo aluno num curso.
	 * 
	 * @pre c != null
	 * @pre matriculado(c)
	 * @post result >= 0
	 * @param c
	 *            Curso a procurar
	 * @return numero de Creditos Obtidos (Integer)
	 ***********************************************************/
	public int creditosObtidos(Curso c) {
		assert c != null : "Curso Invalido";
		assert matriculado(c) : "O Aluno não está matriculado em "
				+ c.getNome();
		int result = 0;
		for (Oferta o : Oferta.objectos())
			if (o.getPerfil().getCurso() == c
					&& aprovadas().contains(o.getDisciplina()))
				result += o.getEcts();

		assert result >= 0 : "Calculo do numero de creditos invalidos";
		return result;
	}

	/***********************************************************
	 * Devolve o conjunto de Disciplinas a que o Aluno está aprovado.
	 * 
	 * @return Set de Disciplina
	 ***********************************************************/
	public Set<Disciplina> aprovadas() {
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
	public String toString() {
		return "Aluno [numero=" + numero + ", nome()=" + getNome()
				+ ", email()=" + getEmail() + "]";
		// return "Aluno [numero=" + numero + ", inscricoes()=" + inscricoes() +
		// ", disciplinas()=" + disciplinas()
		// + ", matriculas()=" + matriculas() + ", perfis()=" + perfis() +
		// ", getNumero()=" + getNumero()
		// + ", aprovadas()=" + aprovadas() + ", getNome()=" + getNome() +
		// ", getDataNascimento()="
		// + getDataNascimento() + ", getEmail()=" + getEmail() + ", idade()=" +
		// idade() + "]";
	}

	/**
	 * Verifica o aluno esta matriculado em pelo menos um perfil do curso.
	 * 
	 * @param c
	 *            Curso
	 * @return true caso o aluno esteja matriculado pelo menos num perfil do
	 *         curso, false caso contrario.
	 */
	public boolean matriculado(Curso c) {
		assert c != null;
		Set<Perfil> perfis = c.perfis();
		for (Perfil p : perfis)
			if (p.alunos().contains(this))
				return true;
		return false;
	}

	/**
	 * Verifica se o aluno está inscrito na Disciplina passada por argumento.
	 * 
	 * @param d
	 *            Disciplina
	 * @return true caso o aluno esteja inscrito, false caso contrário.
	 */
	public boolean inscrito(Disciplina d) {
		assert d != null;
		return d.alunos().contains(this);
	}

	/**
	 * Devolve a nota que o aluno tem a uma determinada disciplina.
	 * 
	 * @param d
	 *            Disciplina a consultar
	 * @return nota do aluno, -1 caso esta ainda nao esteja lançada.
	 */
	public int getNota(Disciplina d) {
		assert d != null;
		assert inscricoes().contains(d);

		int nota = -1;
		Set<Inscricao> inscricoes = inscricoes();
		for (Inscricao i : inscricoes)
			if (i.getDisciplina() == d && i.getDataResultado() != null) {
				nota = i.getResultado();
				break;
			}

		assert nota == -1 || nota >= 0 && nota <= 20;
		return nota;
	}
}

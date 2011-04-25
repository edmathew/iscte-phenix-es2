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
public class Disciplina {
	private static Set<Disciplina> disciplinas = new HashSet<Disciplina>(1000);

	private String nome;

	private AreaCientifica areaCientifica;
	private Professor regente;
	private Set<Professor> equipaDocente = new HashSet<Professor>();
	private Set<Disciplina> precedentes = new HashSet<Disciplina>();

	private boolean checkInvariants() {
		return nome != null && nome.length() > 0 && regente != null
				&& equipaDocente != null && equipaDocente.size() > 0
				&& precedentes != null;
	}

	/***********************************************************
	 * @return the disciplinas
	 ***********************************************************/
	public static Set<Disciplina> objectos() {
		return disciplinas;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		disciplinas.clear();
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Inscricao> inscricoes() {
		Set<Inscricao> result = new HashSet<Inscricao>();
		for (Inscricao i : Inscricao.objectos())
			if (i.getDisciplina() == this)
				result.add(i);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Aluno> alunos() {
		Set<Aluno> result = new HashSet<Aluno>();
		for (Inscricao i : inscricoes())
			result.add(i.getAluno());
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Oferta> ofertas() {
		Set<Oferta> result = new HashSet<Oferta>();
		for (Oferta o : Oferta.objectos())
			if (o.getDisciplina() == this)
				result.add(o);
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Perfil> perfis() {
		Set<Perfil> result = new HashSet<Perfil>();
		for (Oferta o : ofertas())
			result.add(o.getPerfil());
		return result;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public Set<Disciplina> seguintes() {
		Set<Disciplina> result = new HashSet<Disciplina>();
		for (Disciplina d : Disciplina.objectos())
			if (d.getPrecedentes().contains(this))
				result.add(d);
		return result;
	}

	/***********************************************************
       * 
       ***********************************************************/
	public Disciplina() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
		disciplinas.add(this);
	}

	/***********************************************************
	 * @param nome
	 * @param precedentes
	 * @param areaCientifica
	 * @param regente
	 * @param equipaDocente
	 ***********************************************************/
	public Disciplina(String nome, Set<Disciplina> precedentes,
			AreaCientifica areaCientifica, Professor regente,
			Set<Professor> equipaDocente) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		assert areaCientifica != null : "Invalid areaCientifica";
		assert regente != null : "Invalid regente";
		assert equipaDocente != null && equipaDocente.size() > 0 : "Invalid equipaDocente";
		assert precedentes != null : "Invalid precedentes";

		this.nome = nome;
		this.precedentes = precedentes;
		this.areaCientifica = areaCientifica;
		this.regente = regente;
		this.equipaDocente = equipaDocente;

		assert checkInvariants() : "Class Invariant isn't satisfied";
		disciplinas.add(this);
	}

	/***********************************************************
	 * @return the nome
	 ***********************************************************/
	public String getNome() {
		return nome;
	}

	/***********************************************************
	 * @param nome
	 *            the nome to set
	 ***********************************************************/
	public void setNome(String nome) {
		assert nome != null && nome.length() > 0 : "Invalid nome";
		this.nome = nome;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param a
	 ***********************************************************/
	public void efectuaInscricao(Aluno a) {
		assert a != null : "Invalid aluno";
		assert !a.disciplinas().contains(this) : "O aluno já se encontra inscrito";
		for (Disciplina d : precedentes)
			assert a.nota(d) >= 10 : "O aluno não está aprovado a todas as precedentes";

		Inscricao.objectos().add(
				new Inscricao(a, this, CalendarDate.today(), null, 0));

		assert a.disciplinas().contains(this) : "A operacao nao foi bem sucedida";
	}

	/***********************************************************
	 * @return the precedentes
	 ***********************************************************/
	public Set<Disciplina> getPrecedentes() {
		return precedentes;
	}

	public void addPrecedentes(Disciplina d) {
		assert d != null : "Invalid disciplina";
		this.precedentes.add(d);
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @return the areaCientifica
	 ***********************************************************/
	public AreaCientifica getAreaCientifica() {
		return areaCientifica;
	}

	/***********************************************************
	 * @return the regente
	 ***********************************************************/
	public Professor getRegente() {
		return regente;
	}

	/***********************************************************
	 * @return the equipaDocente
	 ***********************************************************/
	public Set<Professor> getEquipaDocente() {
		return equipaDocente;
	}

	/***********************************************************
	 * @param areaCientifica
	 *            the areaCientifica to set
	 ***********************************************************/
	public void setAreaCientifica(AreaCientifica areaCientifica) {
		assert areaCientifica != null : "Invalid areaCientifica";
		this.areaCientifica = areaCientifica;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param regente
	 *            the regente to set
	 ***********************************************************/
	public void setRegente(Professor regente) {
		assert regente != null : "Invalid regente";
		this.regente = regente;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	public void addEquipaDocente(Professor p) {
		assert p != null : "Invalid professor";
		this.equipaDocente.add(p);
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", areaCientifica="
				+ areaCientifica.getNome() + ", regente=" + regente.getNome()
				+ "]";
	}

}
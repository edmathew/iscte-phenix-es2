package builder;

import business.CalendarDate;

/***********************************************************
 * Filename: Pessoa.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public abstract class Pessoas {

	protected String nome;
	protected CalendarDate dataNascimento;
	protected String email;

	/** Invariante da classe. */
	private boolean checkInvariants() {
		return nome != null && nome.length() > 0 && dataNascimento != null
				&& idade() > 0 && email != null && email.length() > 0;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public Pessoas() {
		super();
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 ***********************************************************/
	public Pessoas(String nome, CalendarDate dataNascimento, String email) {
		assert nome != null && nome.length() > 0 : "Invalid nome -> " + nome;
		assert dataNascimento != null
				&& dataNascimento.isBefore(CalendarDate.today()) : "Invalid dataNascimento -> "
				+ dataNascimento;
		assert email != null && email.length() > 0 : "Invalid Email->" + email;

		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;

		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @return the nome
	 ***********************************************************/
	public String getNome() {
		return nome;
	}

	/***********************************************************
	 * @return the dataNascimento
	 ***********************************************************/
	public CalendarDate getDataNascimento() {
		return dataNascimento;
	}

	/***********************************************************
	 * @return the email
	 ***********************************************************/
	public String getEmail() {
		return email;
	}

	/***********************************************************
	 * @param nome
	 *            the nome to set
	 ***********************************************************/
	public void setNome(String nome) {
		assert nome != null && nome.length() > 0 : "Invalid nome -> " + nome;
		this.nome = nome;
		assert checkInvariants() : "Class Invariant isn't satisfied";

	}

	/***********************************************************
	 * @param dataNascimento
	 *            the dataNascimento to set
	 ***********************************************************/
	public void setDataNascimento(CalendarDate dataNascimento) {
		assert dataNascimento != null
				&& dataNascimento.isBefore(CalendarDate.today()) : "Invalid dataNascimento -> "
				+ dataNascimento;
		this.dataNascimento = dataNascimento;
		assert checkInvariants() : "Class Invariant isn't satisfied";
	}

	/***********************************************************
	 * @param email
	 *            the email to set
	 ***********************************************************/
	public void setEmail(String email) {
		assert email != null && email.length() > 0 : "Invalid Email ->" + email;
		this.email = email;
		assert checkInvariants() : "Class Invariant isn't satisfied";
		;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public abstract int idade();

	public abstract boolean verificaMaiorIdade();

	@Override
	public String toString() {
		return "Nome " + getNome() + " Data de Nascimento "
				+ getDataNascimento() + " email: " + getEmail();
	}
}

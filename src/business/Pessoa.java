package business;

import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * Filename: Pessoa.java
 * Created:  2009/10/20
 ***********************************************************/

/***********************************************************
 * @author FBA 2009/10/20
 * 
 ***********************************************************/
public abstract class Pessoa {

	private String nome;
	private CalendarDate dataNascimento;
	private String email;

	/***********************************************************
     * 
     ***********************************************************/
	public Pessoa() {
		super();
	}

	/***********************************************************
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 ***********************************************************/
	public Pessoa(String nome, CalendarDate dataNascimento, String email) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		assertVars();
	}

	/**
	 * Metodo Invariante da Classe
	 */
	public boolean assertVars() {
		return nome != null && !nome.equals("") && dataNascimento != null
				&& email != null && idade() > 0;
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
		this.nome = nome;
	}

	/***********************************************************
	 * @param dataNascimento
	 *            the dataNascimento to set
	 ***********************************************************/
	public void setDataNascimento(CalendarDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/***********************************************************
	 * @param email
	 *            the email to set
	 ***********************************************************/
	public void setEmail(String email) {
		this.email = email;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public int idade() {
		return CalendarDate.today().yearsSince(dataNascimento);
	}
}

package factories;

import business.CalendarDate;
import business.Pessoa;
import business.Seccao;
import business.Professor.Categoria;
import business.Professor.GrauAcademico;

public interface AbstractPessoaFactory {

	/**
	 * 
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param numero
	 * @return
	 */
	public Pessoa criaAluno(String nome, CalendarDate dataNascimento,
			String email, int numero);

	/**
	 * 
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param grau
	 * @param nivel
	 * @param extensao
	 * @param gabinete
	 * @param seccao
	 * @return
	 */
	public Pessoa criaProfessor(String nome, CalendarDate dataNascimento,
			String email, GrauAcademico grau, Categoria nivel, int extensao,
			String gabinete, Seccao seccao);

}

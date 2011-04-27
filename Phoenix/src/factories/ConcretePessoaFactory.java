package factories;

import business.Aluno;
import business.CalendarDate;
import business.Pessoa;
import business.Professor;
import business.Professor.*;
import business.Seccao;

public class ConcretePessoaFactory implements AbstractPessoaFactory{

	@Override
	public Pessoa criaAluno(String nome, CalendarDate dataNascimento,
			String email, int numero) {
		return new Aluno(nome, dataNascimento, email, numero);
	}

	@Override
	public Pessoa criaProfessor(String nome, CalendarDate dataNascimento,
			String email, GrauAcademico grau, Categoria nivel, int extensao,
			String gabinete, Seccao seccao) {
		return new Professor(nome, dataNascimento, email, grau, nivel, extensao, gabinete, seccao);
	}


}

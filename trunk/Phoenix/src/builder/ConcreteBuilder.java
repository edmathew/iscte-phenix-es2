package builder;

import business.CalendarDate;

public class ConcreteBuilder extends Pessoas {

	public final static int idadeMaior = 18;

	public ConcreteBuilder(String nome, CalendarDate dataNascimento,
			String email) {
		super(nome, dataNascimento, email);
	}

	@Override
	public boolean verificaMaiorIdade() {
		if (idade() >= idadeMaior)
			return true;
		else
			return false;

	}

	@Override
	public int idade() {
		int idade = CalendarDate.today().yearsSince(dataNascimento);
		return idade;
	}

	@Override
	public String toString() {
		return super.toString() + " idade " + idade() + " É maior de idade? "
				+ verificaMaiorIdade();
	}

}

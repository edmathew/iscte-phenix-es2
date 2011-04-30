package flyweigth;

import java.util.HashMap;
import java.util.Scanner;

import business.Aluno;
import business.Professor;
import business.Pessoa;

public class FlyweigthFactory {

	private HashMap<String, Pessoa> mapaPessoas = new HashMap<String, Pessoa>();

	public Pessoa getPessoa(String s) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pretende inserir aluno ou professor? (P/A)");

		String escolha = teclado.nextLine();
		if (mapaPessoas.containsKey(s)) {
			return mapaPessoas.get(s);
		} else {
			if (escolha.equals("A")) {

				Aluno a = new Aluno();
				a.setEmail(s);
				a.setNome(" Aluno ");
				return a;
			} else {
				Professor p = new Professor();
				p.setEmail(s);
				p.setNome(" Professor ");
				return p;
			}

		}

	}
}

package business;

import org.junit.BeforeClass;
import org.junit.Test;
import business.Aluno;
import business.CalendarDate;

/**
 * @author Ed Mateus
 * 
 */
public class AlunoTest extends ScenarioLoader {

	public static void toggleAssertions(boolean b) {

		Aluno.class.getClassLoader().setClassAssertionStatus("business.Aluno",
				b);
		Pessoa.class.getClassLoader().setClassAssertionStatus(
				"business.Pessoa", b);
		
	}

	@Test
	public void testScenarioA() {
		toggleAssertions(false);
		loadScenario("data/phenix_A.cmd");
		toggleAssertions(true);

		CalendarDate date = new CalendarDate(31, 7, 1990);
		Aluno a1 = (Aluno) Aluno.objectos().toArray()[0];

		a1.setNumero(-1);
		System.out.println("asdsd");
		// a1.setDataNascimento(date);
		a1.setNome("Ed");
		for (Curso c : Curso.objectos())
			a1.creditosObtidos(c);

		a1.aprovadas();
	}

	@Test
	public void testScenarioB() {
		loadScenario("data/phenix_B.cmd");
		CalendarDate date = new CalendarDate(31, 7, 1990);
		Aluno a1 = (Aluno) Aluno.objectos().toArray()[0];
	}

}

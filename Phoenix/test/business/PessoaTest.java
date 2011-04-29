package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaTest {
	
	private static Aluno a = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Inicial.open("data/phenix_B.cmd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Inicial.reset();
	}

	@Test(expected = AssertionError.class)
	public void testSetNome() {
		new Aluno().setNome(null);
	}

	@Test(expected = AssertionError.class)
	public void testConstructors() {
		a = new Aluno(null, null, null, 1);
	}

	@Test(expected = AssertionError.class)
	public void testConstructors_1() {
		a = new Aluno("Alsd", null, null, 1);
	}

	@Test(expected = AssertionError.class)
	public void testConstructors_2() {
		a = new Aluno("Alsd", new CalendarDate(), null, 1);
	}
	
	@Test (expected = AssertionError.class)
	public void testIdade(){
		new Aluno().idade();
	}

}

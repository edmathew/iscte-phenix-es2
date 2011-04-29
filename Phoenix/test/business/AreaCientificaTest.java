package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AreaCientificaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Inicial.open("data/phenix_B.cmd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Inicial.reset();
	}

	@Test
	public void testFuncoesConsulta() {
		for (AreaCientifica a : AreaCientifica.objectos()) {
			a.disciplinas();
			a.getNome();
			a.toString();
		}
	}

	@Test
	public void testAreaCientificaString() {
		new AreaCientifica("Economia");
	}
	
	@Test (expected = AssertionError.class)
	public void testAreaCientificaString_1() {
		new AreaCientifica(null);
	}

	@Test
	public void testSetNome() {
		for (AreaCientifica a : AreaCientifica.objectos())
			a.setNome(a.getNome() + "2011");
	}
	
	@Test (expected = AssertionError.class)
	public void testSetNome_1() {
		for (AreaCientifica a : AreaCientifica.objectos())
			a.setNome("");
	}

}

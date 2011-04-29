package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DepartamentoTest {

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
		for (Departamento d : Departamento.objectos()) {
			d.seccoes();
			d.getNome();
			d.toString();
		}
	}

	@Test
	public void testDepartamentoString() {
		new Departamento("DepartamentoTest");
	}

	@Test
	public void testSetNome() {
		for (Departamento d : Departamento.objectos())
			d.setNome("Verified " + d);
	}

}

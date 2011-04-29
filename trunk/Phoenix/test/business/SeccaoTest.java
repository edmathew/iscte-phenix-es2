package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SeccaoTest {

	private static Seccao s;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Inicial.open("data/phenix_B.cmd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Inicial.reset();
	}

	@Test
	public void testSeccaoNomeDepartamento() {
		s = new Seccao("S1", new Departamento("DP1"));
	}
	
	@Test (expected = AssertionError.class)
	public void testSeccaoNomeDepartamento_1() {
		new Seccao(null, null);
	}

	@Test (expected = AssertionError.class)
	public void testSeccaoNomeDepartamento_2() {
		new Seccao("DP2", null);
	}
	
	@Test
	public void testToString() {
		s.toString();
	}

	@Test(expected = AssertionError.class)
	public void testSetDepartamanto_1() {
		s.setDepartamento(null);
	}
	
	@Test(expected= AssertionError.class)
	public void testSetNome(){
		s.setNome(null);
	}
	
	@Test(expected= AssertionError.class)
	public void testSetNome_1(){
		s.setNome("");
	}
}

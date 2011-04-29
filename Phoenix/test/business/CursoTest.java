package business;

import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import business.Professor.Categoria;
import business.Professor.GrauAcademico;

public class CursoTest {

	private static Curso c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Inicial.open("data/phenix_B.cmd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Inicial.reset();
	}

	@Test
	public void testCursoStringIntProfessorProfessorSetOfProfessor() {
		Professor f = new Professor("EcoProf", new CalendarDate(25, 8, 1957),
				"ecoprof@email.com", GrauAcademico.agregado,
				Categoria.profAssociado, 2, "A21", new Seccao());
		Set<Professor> profs = new HashSet<Professor>();
		c = new Curso("Economia", 2, f, f, profs);
	}

	@Test(expected = AssertionError.class)
	public void testCursoStringIntProfessorProfessorSetOfProfessor_1() {
		new Curso(null, 0, null, null, null);
	}

	@Test(expected = AssertionError.class)
	public void testCursoStringIntProfessorProfessorSetOfProfessor_2() {
		new Curso("C1", -1, null, null, null);
	}

	@Test(expected = AssertionError.class)
	public void testCursoStringIntProfessorProfessorSetOfProfessor_5() {
		new Curso("C1", 0, null, null, null);
	}

	@Test(expected = AssertionError.class)
	public void testCursoStringIntProfessorProfessorSetOfProfessor_3() {
		new Curso("C1", 0, new Professor(), null, null);
	}

	@Test(expected = AssertionError.class)
	public void testCursoStringIntProfessorProfessorSetOfProfessor_4() {
		new Curso("C1", 0, new Professor(), new Professor(), null);
	}

	@Test
	public void testFuncoesConsulta() {
		for (Curso c : Curso.objectos()) {
			c.perfis();
			c.toString();
			c.getCoordenador();
			c.getCoordenadorErasmus();
			c.getNome();
			c.getNumerusClausus();
			c.getCoordenador();
			c.getCoordenadorErasmus();
			c.getComissaoCientifica();
			c.toString();
		}
	}

	@Test
	public void testSetCoordenador() {
		c.setCoordenador(c.getCoordenador());
	}

	@Test
	public void testSetCoordenadorErasmus() {
		c.setCoordenadorErasmus(c.getCoordenador());
	}

	@Test
	public void testAddComissaoCientifica() {
		for (Professor f : Professor.objectos())
			c.addComissaoCientifica(f);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetName(){
		c.setNome(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetNumerusClausus(){
		c.setNumerusClausus(-1);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetCoordenador_1(){
		c.setCoordenador(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetCoordenadorErasmus_1(){
		c.setCoordenadorErasmus(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testAddComissaoCientifica_1(){
		c.addComissaoCientifica(null);
	}
	

}

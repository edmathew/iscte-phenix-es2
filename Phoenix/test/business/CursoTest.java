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

}

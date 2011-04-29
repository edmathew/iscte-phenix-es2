package business;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import business.Professor.Categoria;
import business.Professor.GrauAcademico;

public class ProfessorTest {

	private static Professor f;

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
		for (Professor f : Professor.objectos()) {
			f.regidas();
			f.leccionadas();
			f.curso_c();
			f.curso_cc();
			f.curso_ce();
			f.getGrau();
			f.getNivel();
			f.getExtensao();
		}
	}

	@Test
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao() {
		f = new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, Categoria.assistente, 9,
				"Gb6", new Seccao());
	}

	@Test
	public void testSetGrau() {
		f.setGrau(GrauAcademico.doutor);
	}

	@Test
	public void testSetNivel() {
		f.setNivel(Categoria.profAssociado);
	}

	@Test
	public void testSetExtensao() {
		f.setExtensao(56);
	}

	@Test
	public void testSetGabinete() {
		f.setGabinete("l85");
	}

	@Test
	public void testLancaResultado() {
		for(Disciplina d: Disciplina.objectos()){
			d.addEquipaDocente(f);
			for(Aluno a: d.alunos())
				f.lancaResultado(d, a, (int)Math.random()*20);
		}
				
	}

	@Test
	public void testGetSeccao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSeccao() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}

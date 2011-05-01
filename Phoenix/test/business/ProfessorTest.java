package business;

import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import business.Professor.Categoria;
import business.Professor.GrauAcademico;

public class ProfessorTest {

	private static Professor f;
	private static Disciplina d;
	private static AreaCientifica area = new AreaCientifica("Economia");

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
			f.getGabinete();
			f.getSeccao();
			f.toString();
		}
	}

	@Test
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao() {
		f = new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, Categoria.assistente, 9,
				"Gb6", new Seccao());
	}

	@Test(expected = AssertionError.class)
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao_1() {
		new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", null, null, 0, null, null);
	}
	
	@Test(expected = AssertionError.class)
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao_2() {
		new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, null, 0, null, null);
	}
	
	@Test(expected = AssertionError.class)
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao_3() {
		new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, Categoria.assistente, 0, null, null);
	}
	
	@Test(expected = AssertionError.class)
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao_4() {
		new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, Categoria.assistente, 1, null, null);
	}
	
	@Test(expected = AssertionError.class)
	public void testProfessorStringCalendarDateStringGrauAcademicoCategoriaIntStringSeccao_5() {
		new Professor("ProfessorF", new CalendarDate(26, 9, 1956),
				"f@mail.com", GrauAcademico.agregado, Categoria.assistente, 1, "S1", null);
	}
	
	@Test
	public void testSetGrau() {
		f.setGrau(GrauAcademico.doutor);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetGrau_1(){
		f.setGrau(null);
	}

	@Test
	public void testSetNivel() {
		f.setNivel(Categoria.profAssociado);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetNivel_1(){
		f.setNivel(null);
	}

	@Test
	public void testSetExtensao() {
		f.setExtensao(56);
	}

	@Test (expected = AssertionError.class)
	public void testSetExtensao_1(){
		f.setExtensao(-1);
	}
	
	@Test
	public void testSetGabinete() {
		f.setGabinete("l85");
	}

	@Test (expected = AssertionError.class)
	public void testSetGabinete_1(){
		f.setGabinete(null);
	}
	
	@Test
	public void testLancaResultado() {
		for (Disciplina d : Disciplina.objectos()) {
			d.addEquipaDocente(f);
			for (Aluno a : d.alunos()) {
				if (a.inscricoes().contains(d))
					f.lancaResultado(d, a, (int) Math.random() * 20);
			}
		}
	}
	
	@Test (expected = AssertionError.class)
	public void testLancaResultado_1(){
		f.lancaResultado(null, null, 0);
	}
	
	@Test (expected = AssertionError.class)
	public void testLancaResultado_2(){
		f.lancaResultado(new Disciplina(), null, 0);
	}
	
	@Test (expected = AssertionError.class)
	public void testLancaResultado_3(){
		f.lancaResultado(new Disciplina(), new Aluno(), -1);
	}
	
	@Test (expected = AssertionError.class)
	public void testLancaResultado_4() {
		for (Disciplina d : Disciplina.objectos()) {
			d.addEquipaDocente(f);
			for (Aluno a : d.alunos()) {
				if (!a.inscricoes().contains(d))
					f.lancaResultado(d, a, (int) Math.random() * 20);
			}
		}
	}

	@Test (expected = AssertionError.class)
	public void testLancaResultado_5() {
		Set<Professor> profs = new HashSet<Professor>();
		profs.add(f);
		d = new Disciplina("DisciplinaTeste", new HashSet<Disciplina>(), area,
				f, profs);
		Aluno a = new Aluno();
		new Inscricao(a, d, new CalendarDate(21,1,2011), CalendarDate.today(), 10);
		f.lancaResultado(d, a, 10);
	}
	
	@Test (expected = AssertionError.class)
	public void testLancaResultado_6() {
		Set<Professor> profs = new HashSet<Professor>();
		profs.add(f);
		d = new Disciplina("DisciplinaTeste", new HashSet<Disciplina>(), area,
				f, profs);
		Aluno a = new Aluno();
		new Inscricao(a, d, new CalendarDate(21,1,2011), null, 10);
		f.lancaResultado(d, a, 10);
	}
	
	@Test
	public void testSetSeccao() {
		for (Seccao s : Seccao.objectos())
			f.setSeccao(s);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetSeccao_1(){
		f.setSeccao(null);
	}
}

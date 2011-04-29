package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlunoTest {

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
		for (Aluno al : Aluno.objectos()) {
			al.aprovadas();
			al.disciplinas();
			al.matriculas();
			al.perfis();
			al.getNome();
			al.getDataNascimento();
			al.getEmail();
			al.getNumero();
			al.toString();
			al.getMessageSystem();
		}
	}
	
	@Test (expected = AssertionError.class)
	public void testAlunoNomeDateEmailNumero(){
		new Aluno("A1", new CalendarDate(31,7,1990), "mail@mail.com", -1);
	}
	

	@Test (expected = AssertionError.class)
	public void testAlunoNomeDateEmailNumero_1(){
		new Aluno("A1", new CalendarDate(31,7,1990), "mail@mail.com", 0);
	}
	
	@Test
	public void testAlunoNomeDateEmailNumero_2(){
		new Aluno("A1", new CalendarDate(31,7,1990), "mail@mail.com", 3);
	}
	
	@Test
	public void testSetNumero_1() {
		Aluno a = new Aluno("Aluno1", new CalendarDate(), "mail@mail.com", 25);
		a.setNumero(2048);
		a.getNumero();
	}
	
	@Test (expected = AssertionError.class)
	public void testSetNumero_2() {
		Aluno a = new Aluno("Aluno1", new CalendarDate(), "mail@mail.com", 25);
		a.setNumero(-1);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetNumero_3() {
		Aluno a = new Aluno("Aluno1", new CalendarDate(), "mail@mail.com", 25);
		a.setNumero(0);
	}

	@Test
	public void testCreditosObtidos_AND_inscritoNoCurso() {
		for (Aluno a : Aluno.objectos())
			for (Curso c : Curso.objectos())
				if (a.inscritoNoCurso(c))
					a.creditosObtidos(c);
	}

	@Test
	public void testNotaLancada_AND_nota() {
		for (Aluno a : Aluno.objectos())
			for (Disciplina d : Disciplina.objectos())
				if (a.notaLancada(d))
					a.nota(d);
	}

	@Test
	public void testSetDataNascimento() {
		CalendarDate d = new CalendarDate(25, 4, 1974);
		for (Aluno a : Aluno.objectos())
			a.setDataNascimento(d);
	}

	@Test
	public void testSetEmail() {
		for (Aluno a : Aluno.objectos())
			a.setEmail(a.getNome() + "@mail.com");
	}

	@Test
	public void testIdade() {
		Aluno a = new Aluno("Ed", new CalendarDate(31,7,1990),"ed@mail.com" ,201782);
		a.idade();
	}
	
	@Test (expected = AssertionError.class)
	public void testNota(){
		new Aluno().nota(null);
	}

	@Test
	public void testNota_1(){
		for(Disciplina d: Disciplina.objectos())
			new Aluno().nota(d);
	}
	
	@Test (expected = AssertionError.class)
	public void testInscritoNoCursoNull(){
		new Aluno().inscritoNoCurso(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testNotaLancadaNull(){
		new Aluno().notaLancada(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testCreditosObtidos(){
		new Aluno().creditosObtidos(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testCreditosObtidos_1(){
		for(Curso c: Curso.objectos())
			new Aluno().creditosObtidos(c);
	}
}

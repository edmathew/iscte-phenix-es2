package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatriculaTest {

	private static Matricula m = null;

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
		for (Matricula m : Matricula.objectos()) {
			m.toString();
			m.getAluno();
			m.getDataInscricao();
			m.getPerfil();
			m.getPaga();
		}
	}

	@Test
	public void testMatriculaAlunoPerfilCalendarDate() {
		for (Aluno a : Aluno.objectos())
			m = new Matricula(a, new Perfil(), CalendarDate.today());
	}
	
	@Test (expected = AssertionError.class)
	public void testMatriculaAlunoPerfilCalendarDate_1() {
			new Matricula(null, null, CalendarDate.today());
	}
	
	@Test (expected = AssertionError.class)
	public void testMatriculaAlunoPerfilCalendarDate_2() {
			new Matricula(new Aluno(), null, CalendarDate.today());
	}
	
	@Test (expected = AssertionError.class)
	public void testMatriculaAlunoPerfilCalendarDate_3() {
			new Matricula(new Aluno(), new Perfil(), null);
	}

	@Test
	public void testSetAluno() {
		m.setAluno(new Aluno("AlunoTest", new CalendarDate(31,7,1990), "test@mail.com", 464674));
	}
	
	@Test (expected = AssertionError.class)
	public void testSetAluno_1() {
		m.setAluno(null);
	}

	@Test
	public void testSetPerfil() {
		for(Perfil p: Perfil.objectos())
			m.setPerfil(p);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetPerfil_1() {
		m.setPerfil(null);
	}

	@Test
	public void testSetDataInscricao() {
		m.setDataInscricao(CalendarDate.today());
	}
	
	@Test (expected = AssertionError.class)
	public void testSetDataInscricao_2() {
		m.setDataInscricao(null);
	}

	@Test
	public void testSetPaga() {
		m.setPaga(true);
		m.setPaga(false);
	}

	@Test
	public void testPagar() {
		m.pagar();
	}
}

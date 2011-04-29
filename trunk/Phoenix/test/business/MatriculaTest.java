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

	@Test
	public void testSetAluno() {
		m.setAluno(new Aluno("AlunoTest", new CalendarDate(31,7,1990), "test@mail.com", 464674));
	}

	@Test
	public void testSetPerfil() {
		for(Perfil p: Perfil.objectos())
			m.setPerfil(p);
	}

	@Test
	public void testSetDataInscricao() {
		m.setDataInscricao(CalendarDate.today());
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

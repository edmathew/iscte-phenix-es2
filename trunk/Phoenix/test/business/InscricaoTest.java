package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InscricaoTest {
	
	private static Aluno a = new Aluno("AlunoTest", new CalendarDate(31,7,1990), "test@mail.com", 464674);

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
		for(Inscricao i: Inscricao.objectos()){
			i.toString();
			i.getAluno();
			i.getDisciplina();
			i.getDataInscricao();
			i.getDataResultado();
		}
	}

	@Test
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt() {
		for(Disciplina d: Disciplina.objectos())
			new Inscricao(a, d, CalendarDate.today(), null, 0);
	}

}

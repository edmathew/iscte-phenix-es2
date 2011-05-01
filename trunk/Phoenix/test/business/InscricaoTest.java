package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InscricaoTest {

	private static Aluno a = new Aluno("AlunoTest", new CalendarDate(31, 7,
			1990), "test@mail.com", 464674);
	
	private static Inscricao i = new Inscricao(a, new Disciplina(), CalendarDate.today(), null, 0);

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
		for (Inscricao i : Inscricao.objectos()) {
			i.toString();
			i.getAluno();
			i.getDisciplina();
			i.getDataInscricao();
			i.getDataResultado();
		}
	}

	@Test
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt() {
		for (Disciplina d : Disciplina.objectos())
			new Inscricao(a, d, CalendarDate.today(), null, 0);
	}

	@Test(expected = AssertionError.class)
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt_1() {
		new Inscricao(null, null, CalendarDate.today(), null, 0);
	}
	
	@Test(expected = AssertionError.class)
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt_2() {
		new Inscricao(new Aluno(), null, CalendarDate.today(), null, 0);
	}
	
	@Test(expected = AssertionError.class)
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt_3() {
		new Inscricao(new Aluno(), new Disciplina(), new CalendarDate(21,1,2011), new CalendarDate(20, 1, 2011), 0);
	}
	
	@Test(expected = AssertionError.class)
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt_5() {
		new Inscricao(new Aluno(), new Disciplina(), new CalendarDate(21,1,2011), CalendarDate.today(), -1);
	}
	
	@Test(expected = AssertionError.class)
	public void testInscricaoAlunoDisciplinaCalendarDateCalendarDateInt_4() {
		new Inscricao(new Aluno(), new Disciplina(), null, null, 0);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetAluno(){
		i.setAluno(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetDisciplina(){
		i.setDisciplina(null);
	}
	
	@Test 
	public void testSetDataIns_1(){
		i.setDataInscricao(CalendarDate.today());
	}
	
	@Test (expected = AssertionError.class)
	public void testSetDataIns(){
		i.setDataInscricao(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetDataRes(){
		i.setDataResultado(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetResultado(){
		i.setResultado(-1);
	}
	
	

}

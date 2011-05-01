package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import business.Oferta.Semestre;

public class OfertaTest {
	
	private static Oferta oferta = new Oferta();
	
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
		for(Oferta o: Oferta.objectos()){
			o.getAno();
			o.getDisciplina();
			o.getEcts();
			o.getPerfil();
			o.getSemestre();
			o.getVagas();
			o.isObrigatoria();
		}
	}

	@Test
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean() {
		oferta = new Oferta(new Disciplina(), new Perfil(), 10, Semestre.par, 2, true);
		oferta.toString();
	}
	
	@Test (expected = AssertionError.class)
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean_1() {
		new Oferta(null, new Perfil(), 10, Semestre.par, 2, true);
	}
	
	@Test (expected = AssertionError.class)
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean_2() {
		new Oferta(new Disciplina(), null, 10, Semestre.par, 2, true);
	}
	
	@Test (expected = AssertionError.class)
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean_3() {
		new Oferta(new Disciplina(), new Perfil(), -1, Semestre.par, 2, true);
	}
	
	@Test (expected = AssertionError.class)
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean_4() {
		new Oferta(new Disciplina(), new Perfil(), 10, null, 2, true);
	}
	
	@Test (expected = AssertionError.class)
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean_5() {
		new Oferta(new Disciplina(), new Perfil(), 10, Semestre.par, -1, true);
	}


	@Test
	public void testSetDisciplina() {
		for(Disciplina d: Disciplina.objectos())
			oferta.setDisciplina(d);
	}
	
	@Test (expected = AssertionError.class)
	public void testSetDisciplina_1(){
		oferta.setDisciplina(null);
	}

	@Test
	public void testSetPerfil() {
		for(Perfil p: Perfil.objectos())
			oferta.setPerfil(p);
	}

	@Test(expected = AssertionError.class)
	public void testSetPerfil_1(){
		oferta.setPerfil(null);
	}
	
	@Test
	public void testSetEcts() {
		oferta.setEcts(6);
	}

	@Test(expected = AssertionError.class)
	public void testSetEcts_1(){
		oferta.setEcts(-1);
	}
	
	@Test
	public void testSetSemestre() {
		oferta.setSemestre(Semestre.impar);
	}

	@Test(expected = AssertionError.class)
	public void testSetSemestre_1(){
		oferta.setSemestre(null);
	}
	
	@Test
	public void testSetAno() {
		oferta.setAno(3);
	}

	@Test(expected = AssertionError.class)
	public void testSetAno_1(){
		oferta.setAno(-1);
	}
	
	@Test
	public void testSetObrigatoria() {
		oferta.setObrigatoria(true);
	}
	
	@Test
	public void testSetVagas(){
		oferta.setVagas(45);
	}
	
	@Test(expected = AssertionError.class)
	public void testSetVagas_1(){
		oferta.setVagas(-1);
	}
	
	
}

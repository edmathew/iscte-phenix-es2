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
		}
	}

	@Test
	public void testOfertaDisciplinaPerfilIntSemestreIntBoolean() {
		oferta = new Oferta(new Disciplina(), new Perfil(), 10, Semestre.par, 2, true);
	}

	@Test
	public void testSetDisciplina() {
		for(Disciplina d: Disciplina.objectos())
			oferta.setDisciplina(d);
	}

	@Test
	public void testSetPerfil() {
		for(Perfil p: Perfil.objectos())
			oferta.setPerfil(p);
	}

	@Test
	public void testSetEcts() {
		oferta.setEcts(6);
	}

	@Test
	public void testSetSemestre() {
		oferta.setSemestre(Semestre.impar);
	}

	@Test
	public void testSetAno() {
		oferta.setAno(3);
	}

	@Test
	public void testSetObrigatoria() {
		oferta.setObrigatoria(true);
	}
	
	@Test
	public void testSetVagas(){
		oferta.setVagas(45);
	}
}

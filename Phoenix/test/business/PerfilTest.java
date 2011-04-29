package business;

import java.util.HashSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PerfilTest {

	private static Perfil perfil = new Perfil();

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
		for (Perfil p : Perfil.objectos()) {
			p.matriculas();
			p.alunos();
			p.disciplinas();
			p.ofertas();
		}
	}

	@Test
	public void testPerfilNomeEctsCurso() {
		perfil = new Perfil("P1", 60, new Curso());
	}

	@Test
	public void testSetEcts() {
		perfil.setEcts(40);
	}

	@Test
	public void testEfectuaMatricula() {
		for (Aluno a : Aluno.objectos())
			if (!a.perfis().contains(perfil))
				perfil.efectuaMatricula(a);
	}

	@Test
	public void testSetCurso() {
		Curso c = new Curso("c1", 61, new Professor(), new Professor(),
				new HashSet<Professor>());
		perfil.setCurso(c);
		perfil.toString();
	}
	
	@Test
	public void testSetNome() {
		perfil.setNome("Perfil 1");
	}
}

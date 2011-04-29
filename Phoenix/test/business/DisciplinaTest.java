package business;

import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import business.Professor.Categoria;
import business.Professor.GrauAcademico;

public class DisciplinaTest {

	private static Disciplina d;
	private static AreaCientifica area = new AreaCientifica("Economia");
	private static Professor f = new Professor("EcoProf", new CalendarDate(25,
			8, 1957), "ecoprof@email.com", GrauAcademico.agregado,
			Categoria.profAssociado, 2, "A21", new Seccao());

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
		for (Disciplina d : Disciplina.objectos()) {
			d.inscricoes();
			d.alunos();
			d.ofertas();
			d.perfis();
			d.seguintes();
			d.getAreaCientifica();
			d.getEquipaDocente();
			d.getPrecedentes();
			d.getNome();
			d.getRegente();
			d.toString();
		}
	}

	@Test
	public void testDisciplinaStringSetOfDisciplinaAreaCientificaProfessorSetOfProfessor() {
		Set<Professor> profs = new HashSet<Professor>();
		profs.add(f);
		d = new Disciplina("DisciplinaTeste", new HashSet<Disciplina>(), area,
				f, profs);
	}

	public void testSetNome() {
		d.setNome("Disciplina II");
	}

	@Test
	public void testEfectuaInscricao() {
		for (Aluno aluno : Aluno.objectos())
			d.efectuaInscricao(aluno);
	}

	@Test
	public void testGetPrecedentes() {
		d.getPrecedentes();
	}

	@Test
	public void testAddPrecedentes() {
		Set<Professor> profs = new HashSet<Professor>();
		profs.add(f);
		d.addPrecedentes(new Disciplina("Disciplina I",
				new HashSet<Disciplina>(), area, f, profs));
	}

	@Test
	public void testSetAreaCientifica() {
		d.setAreaCientifica(new AreaCientifica("Eco"));
	}

	@Test
	public void testSetRegente() {
		Professor f1 = new Professor("RegProf", new CalendarDate(26, 8, 1949),
				"ecoprof@email.com", GrauAcademico.doutor,
				Categoria.profCatedratico, 1, "A1", new Seccao());
		
		d.setRegente(f1);
	}

	 @Test
	 public void testAddEquipaDocente() {
		 for(Professor f1: Professor.objectos())
			d.addEquipaDocente(f1);
	 }
}

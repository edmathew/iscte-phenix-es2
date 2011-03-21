package testPackage;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import business.Aluno;
import business.Inicial;

public class AlunoTest {

	@BeforeClass
	public static void load(){
		Inicial.main(null);
		System.out.println("Loaded");
	}
	
	@Test
	public void testNumber() {
		Set<Aluno> alunos = Aluno.objectos();
//		for(Aluno a: alunos)
//			a.setNumero(-5);
	}
}

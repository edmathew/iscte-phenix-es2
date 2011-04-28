package business;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runners.model.TestClass;

public class AlunoTest extends TestClass{

	public AlunoTest(Class<?> klass) {
		super(klass);
		// TODO Auto-generated constructor stub
	}

	@Test(expected=AssertionError.class)
	public void test1(){
		Aluno a = new Aluno(null, null, "someMail", -1);
	}
}

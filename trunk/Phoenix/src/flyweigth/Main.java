package flyweigth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FlyweigthFactory factory = new FlyweigthFactory();

		System.out.println("Teste do fliweigth");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insia o email da pessoa que pretende procurar: ");
		String s = teclado.nextLine();
		System.out.println(factory.getPessoa(s));
	}

}

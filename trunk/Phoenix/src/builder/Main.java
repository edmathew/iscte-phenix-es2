package builder;

import business.CalendarDate;

public class Main {

	CalendarDate dataNTiago = new CalendarDate(06, 05, 1988);
	Pessoas tiago = new ConcreteBuilder("Tiago Amaral", dataNTiago,
			"tiagoamaraldh@gmail.com");
	CalendarDate dataNEdgar = new CalendarDate(31, 07, 1990);
	Pessoas edgar = new ConcreteBuilder("Edgar Mateus", dataNEdgar,
			"ejpmateus@gmail.com");
	CalendarDate dataNMartim = new CalendarDate(02, 04, 2009);
	Pessoas martim = new ConcreteBuilder("Martim", dataNMartim, null);

	public static void main(String[] args) {

		Main main = new Main();
		System.out.println(main.edgar.toString());
		System.out.println(main.tiago.toString());
		System.out.println(main.martim.toString());

	}

}

package business;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalendarDateTest {

	private static CalendarDate d1;
	private static CalendarDate d2;
	private static CalendarDate d3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		d1 = CalendarDate.today();
		d2 = CalendarDate.today();
		d3 = CalendarDate.today();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Inicial.reset();
	}

	@Test
	public void testConstructors() {
		d1 = new CalendarDate();
		d2 = new CalendarDate(31, 7, 1990);
		d3 = new CalendarDate(d2);
	}

	@Test
	public void testGets_AND_Sets() {
		int aux = d1.getDay();
		d1.setDay(d2.getDay());
		d2.setDay(d3.getDay());
		d3.setDay(aux);

		aux = d1.getMonth();
		d1.setMonth(d2.getMonth());
		d2.setMonth(d3.getMonth());
		d3.setMonth(aux);

		aux = d1.getYear();
		d1.setYear(d2.getYear());
		d2.setYear(d3.getYear());
		d3.setYear(aux);
	}

	@Test
	public void testIsBefore() {
		d1.isBefore(d2);
		d2.isBefore(d3);
		d3.isBefore(d1);
		
		CalendarDate.today().isBefore(new CalendarDate(30,4,2011));
		CalendarDate.today().isBefore(new CalendarDate(27,5,2011));
		CalendarDate.today().isBefore(new CalendarDate(30,3,2011));
		
	}
	
	

	@Test
	public void testIsAfter() {
		d1.isAfter(d2);
		d2.isAfter(d3);
		d3.isAfter(d1);
	}

	@Test
	public void testIsEqual() {
		d1.isEqual(d2);
		d2.isEqual(d3);
		d3.isEqual(d1);
	}

	@Test
	public void testYearsSince() {
		d1.yearsSince(d2);
		d2.yearsSince(d3);
	}

	@Test
	public void testYearsTo() {
		d1.yearsTo(d2);
	}
	
	@Test
	public void testEquals(){
		CalendarDate.today().equals(CalendarDate.today());
		CalendarDate.today().equals(new CalendarDate(31, 7, 1990));
	}
	
	@Test
	public void testToString(){
		d1.toString();
		d2.toString();
		d3.toString();
	}
	
	@Test
	public void testClone(){
		d1.clone();
	}
}

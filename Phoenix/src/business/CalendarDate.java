package business;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/***********************************************************
 * @author FBA 2009/03/10
 * 
 ***********************************************************/
public class CalendarDate {
	private static Set<CalendarDate> calendarDates = new HashSet<CalendarDate>(
			3650);

	private int day;
	private int month;
	private int year;

	/***********************************************************
	 * @return the matriculas
	 ***********************************************************/
	public static Set<CalendarDate> objectos() {
		return calendarDates;
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		calendarDates.clear();
	}

	public CalendarDate() {
		calendarDates.add(this);
	}

	/***********************************************************
	 * @param day
	 * @param month
	 * @param year
	 ***********************************************************/
	public CalendarDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		calendarDates.add(this);
	}

	/***********************************************************
	 * @param day
	 *            current day
	 * @param mes
	 * @param year
	 ***********************************************************/
	public CalendarDate(CalendarDate other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	/***********************************************************
	 * @return
	 ***********************************************************/
	public static CalendarDate today() {
		Calendar cal = Calendar.getInstance();
		return new CalendarDate(cal.get(Calendar.DATE),
				cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR));
	}

	/***********************************************************
	 * @return the day
	 ***********************************************************/
	public int getDay() {
		return day;
	}

	/***********************************************************
	 * @return the month
	 ***********************************************************/
	public int getMonth() {
		return month;
	}

	/***********************************************************
	 * @return the year
	 ***********************************************************/
	public int getYear() {
		return year;
	}

	/***********************************************************
	 * @param day
	 *            the day to set
	 ***********************************************************/
	public void setDay(int day) {
		this.day = day;
	}

	/***********************************************************
	 * @param month
	 *            the month to set
	 ***********************************************************/
	public void setMonth(int month) {
		this.month = month;
	}

	/***********************************************************
	 * @param year
	 *            the year to set
	 ***********************************************************/
	public void setYear(int year) {
		this.year = year;
	}

	/***********************************************************
	 * @param t
	 *            another date
	 * @return
	 ***********************************************************/
	public boolean isBefore(CalendarDate t) {
		return this.year == t.year ? this.month == t.month ? this.day < t.day
				: this.month < t.month : this.year < t.year;
	}

	/***********************************************************
	 * @param t
	 *            another date
	 * @return
	 ***********************************************************/
	public boolean isAfter(CalendarDate t) {
		return !isBefore(t) && !isEqual(t);
	}

	/***********************************************************
	 * @param t
	 *            another date
	 * @return
	 ***********************************************************/
	public boolean isEqual(CalendarDate t) {
		return this.year == t.year && this.month == t.month
				&& this.day == t.day;
	}

	/***********************************************************
	 * @param t
	 *            another date
	 * @return
	 ***********************************************************/
	public int yearsSince(CalendarDate t) {
		return this.month < t.month || this.month == t.month
				&& this.day < t.day ? this.year - t.year - 1 : this.year
				- t.year;
	}

	/***********************************************************
	 * @param t
	 *            another date
	 * @return
	 ***********************************************************/
	public int yearsTo(CalendarDate t) {
		return t.yearsSince(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		CalendarDate d = (CalendarDate) obj;
		return day == d.day && month == d.month && year == d.year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CalendarDate[" + day + "/" + month + "/" + year + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone(java.lang.Object)
	 */
	@Override
	protected Object clone() {
		return new CalendarDate(this);
	}

}

import java.util.GregorianCalendar;

public class GregorianCalendarObjectCreator {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();

		System.out.println("The year is: " + g.get(GregorianCalendar.YEAR) + "\nThe month is: "
				+ g.get(GregorianCalendar.MONTH) + "\nThe day is: " + g.get(GregorianCalendar.DAY_OF_MONTH)+"\n\n");
		
		g.setTimeInMillis(1234567898765L);
		System.out.println("The year is: " + g.get(GregorianCalendar.YEAR) + "\nThe month is: "
				+ g.get(GregorianCalendar.MONTH) + "\nThe day is: " + g.get(GregorianCalendar.DAY_OF_MONTH));
	}
}

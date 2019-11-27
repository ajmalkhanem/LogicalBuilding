package String;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class LocalTme {

	public static void main(String[] args) {
				
		// local time and date 
		
		LocalDate dt=LocalDate.now();
		System.out.println(dt);
		LocalTime tm=LocalTime.now();
		System.out.println(tm);
		LocalDateTime td=LocalDateTime.now();
		System.out.println(td);
		
		
		// using format methods 
		
		DateTimeFormatter fo=DateTimeFormatter.ofPattern("E , MMM : dd : yyyy : HH : mm : ss ");
		String form=td.format(fo);
		System.out.println("format :"+form);
		
		
		//calendar methods
		
		Calendar cal=Calendar.getInstance();
		System.out.println("Current year :"+cal.get(Calendar.YEAR));
		System.out.println("Current day :"+cal.get(Calendar.DATE));
		System.out.println("Current date :"+cal.getTime());
		cal.add(Calendar.DATE, -7);
		System.out.println("7 days ago "+cal.getTime());
		
	}

}

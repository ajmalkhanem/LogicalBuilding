package String;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TmeQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String ss;
		double tota = 0, total = 0, tot = 0;
		StringBuilder sb = new StringBuilder();

		System.out.println("name");
		sb.append("Name :" + s.next() + "\n");
		System.out.println("Address");
		sb.append("Address :" + s.next() + "\n");
		System.out.println("Number of persons");
		int np = s.nextInt();
		System.out.println("Number of rooms");
		int nr = s.nextInt();
		System.out.println("AC/non");
		String ch = s.next();
		System.out.println("Booking date(yyyy-mm-dd)");
		String da1 = s.next();
		System.out.println("checkout date(yyyy-mm-dd)");
		String da2 = s.next();
		

		LocalDate dateBefore = LocalDate.parse(da1);
		LocalDate dateAfter = LocalDate.parse(da2);
		long nofd = ChronoUnit.DAYS.between(dateBefore, dateAfter);

		int n1 = Math.round(np / 2);
		if (n1 == nr) {
			if (ch.contentEquals("y") & (np % 2 != 0))

			{
				total = (1000 + 150 + 250) * nofd * nr;
				tota = (1000 + 150) * nofd * nr - 1;
				total = tota + (250) * nofd;

			} else if (ch.contentEquals("y") & (np % 2 == 0))

			{

				total = (1000 + 150) * nofd * nr;

			} else if (ch.contentEquals("n") & (np % 2 != 0))

			{

				tota = (1000) * nofd * nr - 1;
				total = tota + (250) * nofd;

			} else if (ch.contentEquals("n") & (np % 2 == 0))

			{

				total = (1000) * nofd * nr;

			}
			System.out.println(sb);
			System.out.println("Ac " + ch);
			System.out.println("Booking date " + da1);
			System.out.println("Checkout " + da2);
			System.out.println("Number of persons " + np);
			System.out.println("Number of rooms " + nr);
			System.out.println("Total "+total);
		}

	}

}

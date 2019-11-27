package String;

import java.util.Scanner;

public class Stringbuildercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = "";
		do {
			System.out.printf("1)Car\n2)Bike\n");
			int n = s.nextInt();
			StringBuffer a = new StringBuffer();
			StringBuffer b = new StringBuffer();

			switch (n) {
			case 1:
				System.out.println("Enter the details of car");
				a.append("car details\n");
				System.out.println("Enter the colour");
				a.append("colour :" + s.next() + "\n");
				System.out.println("Enter the maximum speed");
				a.append("Maximum speed :" + s.next() + "\n");
				System.out.println("Enter the number of seats");
				a.append("Number of seats :" + s.next() + "\n");
				System.out.println("Enter the number of wheels");
				a.append("Number of wheels :" + s.next() + "\n");
				System.out.println("Enter the number of doors");
				a.append("Number of doors :" + s.next() + "\n");
				System.out.println("Enter the status of AC(true/false)");
				a.append("AC :" + s.next() + "\n");
				System.out.println(a);
				break;
			case 2:
				System.out.println("Enter the details of car");
				b.append("Bike details\n");
				System.out.println("Enter the colour");
				b.append("Colour :" + s.next() + "\n");
				System.out.println("Enter the maximum speed");
				b.append("Maximum speed :" + s.next() + "\n");
				System.out.println("Enter the number of seats");
				b.append("Number of seats :" + s.next() + "\n");
				System.out.println("Enter the number of wheels");
				b.append("Number of wheels :" + s.next() + "\n");
				System.out.println("Enter the status of diskbreak");
				b.append("Disk break :" + s.next() + "\n");
				System.out.println(b);
				break;
			case 3:
				System.out.println("Invalid option");
				break;
			}
			System.out.println("Do you want to continue?(yes/no)");
			str = s.next();
		} while (str.contentEquals("yes") == true);
		if (str.contentEquals("no") == true) {
			System.exit(0);
		}

	}

}

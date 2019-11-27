package String;

import java.util.Scanner;

public class FLAMES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter boy name ");
		String s1 = s.nextLine();
		System.out.print("Enter girl name ");
		String s2 = s.nextLine();
		int l=s1.length();
		int l1=s2.length();

		String sp1 = s1.substring(0,l);
		String sp2 = s2.substring(0,l1);

		

		for (int i = 0; i <l; i++) {

			for (int j = 0; j <l1; j++) {

				if (s1.substring(i, i + 1).equals(s2.substring(j, j + 1)))
				{

					String s3 = s2.substring(0, j) + s2.substring(j + 1, s2.length());
					
					s2 = s3.substring(0, s3.length());
				} 
				else 
				{
					continue;
				}

			}

		}

		int a = s2.length();

		for (int i = 0; i < sp2.length(); i++) {

			for (int j = 0; j < s1.length(); j++) {

				if (sp2.substring(i, i + 1).equals(s1.substring(j, j + 1))) {

					String s4 = s1.substring(0, j) + s1.substring(j + 1, s1.length());
					
					s1 = s4.substring(0, s4.length());

				} else {
					continue;
				}

			}

		}
		int b = s1.length();

		int sum = a + b;

		while (sum > 6) {
			sum = sum - 6;
		}

		switch (sum) {

		case 1:
			System.out.println(" friends ");
			break;

		case 2:
			System.out.println(" lovers ");
			break;

		case 3:
			System.out.println("affection");
			break;

		case 4:
			System.out.println("marriage");
			break;

		case 5:
			System.out.println("enemies ");
			break;

		case 6:
			System.out.println("sister");
			break;

		default:
			System.out.println(" have no match ");
		}

	}
}

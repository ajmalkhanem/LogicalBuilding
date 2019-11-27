package CompanyQues;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f = 0;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				f = 1;
				break;

			} else {
				
				f = 0;
			}

		}
		if (f == 1) {
			System.out.println("not");
		} else {
			System.out.println("yes");
		}

	}
}

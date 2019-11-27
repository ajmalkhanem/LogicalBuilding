package Patterns;

import java.util.Scanner;

public class Pat13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		int l = str.length();
		for (int i = l-1; i >=0; i--) {
			for (int j = 0; j <= i; j++) {

				System.out.print(str.charAt(j));

			}
			System.out.println();

		}
	}

}

package String;

import java.util.Scanner;

public class StringCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Number of days");
		int day=s.nextInt();
		System.out.println("position");
		
		int Ar[]=new int[day];
		for(int i=0;i<day;i++)
		{
			Ar[i]=s.nextInt();
		}
		char[] c = str.toCharArray();

		
		char temp = c[0];
		c[0] = c[1];
		c[1] = temp;

		String ss = new String(c);

		System.out.println(ss);
	}
}

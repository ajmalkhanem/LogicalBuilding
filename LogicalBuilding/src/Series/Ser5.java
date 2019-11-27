package Series;

import java.util.Scanner;

public class Ser5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		int l1=str1.length();
		int l2=str2.length();
		String str4=str3.toUpperCase();
		for(int i=0;i<l1;i++)
		{
			char c=str1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  )
			
				System.out.print("$");
			
			else
				
			System.out.print(c);
			
		}
		for(int i=0;i<l2;i++)
		{
			char c=str2.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  )
			
				System.out.print(c);
			
			else
				
			System.out.print("#");
		}
		System.out.print(str4);
	}

}

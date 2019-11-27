package CompanyQues;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;double b=0;
		int t=n;
		int cn=0;
		while(t!=0)
		{
			cn++;
			t=t/10;			
		}System.out.println(cn);
		t=n;
		while(t!=0)
		{
			a=t%10;
			b=b+Math.pow(a,cn);
			n=t/10;
		}
		if(b==t)
		{
			System.out.println("yes");
		}
		//System.out.println(b);
		
	}

}

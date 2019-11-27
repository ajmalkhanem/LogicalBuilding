package Series;

import java.util.Scanner;

public class Ser6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println(" series : 0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8.....");
			if(n%2==0)

			{
				n=n/2;
				n=2*(n-1);
				System.out.println((n/2));
				
											
			} 
			else
			{
				
				n=(n/2)+1;
				n=2*(n-1);
				System.out.println((n));
			
			}
			
		}
	}



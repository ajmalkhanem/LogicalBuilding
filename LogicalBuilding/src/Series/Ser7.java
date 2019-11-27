package Series;

import java.util.Scanner;

public class Ser7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
		int even = 0;
	    int odd = 0;
		 
			for (int i = 0; i < a.length; i++) {
				
				a[i]=s.nextInt();
				if (i % 2 == 0) {
					even =even+ a[i];
					if(even>odd)
					{
						even=even;
						//System.out.println(even);
					}
					else
					{
						even=odd;
						//System.out.println(even);
					}
					
				} else {
					odd =odd+ a[i];
					if(even>odd)
					{
						odd=even;
						//System.out.println(odd);
					}
					else
					{
						odd=odd;
					//System.out.println(odd);
					}
					
				}
			}
		 
			if(even>odd)
			{
				
				int max= even;
				System.out.println(max);
			}
			else
			{
				int max=odd;
				System.out.println(max);
				
			}
			
	}

}

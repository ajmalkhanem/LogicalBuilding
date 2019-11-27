package PractQuest;

import java.util.Scanner;

public class SeconLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int A[]=new int[n];
		int i=0,t;
		for(i=0;i<n;i++)
		{
			A[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(A[0]<A[i]) 
			{
				t=A[0];
				A[0]=A[i];
				A[i]=t;
			
				
			}
		}System.out.println(A[n-1]);

	}
}


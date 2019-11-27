package PractQuest;

import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int A[]=new int[n];
		int i=0,j=0,temp;
		for(i=0;i<n;i++)
		{
			A[i]=s.nextInt();
		}
		for (i = 0; i < n; i++)   
        {  
            for (j = i + 1; j < n; j++)   
            {  
                if (A[i] > A[j])   
                {  
                    temp = A[i];  
                    A[i] = A[j];  
                    A[j] = temp;  
                }  
            }  
        } System.out.println(A[0]); 
	}
}


package Patterns;

import java.util.Scanner;

public class Pat20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n=5;
		 for (i = 1; i <= n; i++) 
	        { 
	            for (j = 1; j <= n; j++) 
	            { 
	                if (i == 1) 
	                	 System.out.print("c"); 
	                else if( i == n )
	                		System.out.print("k"); 
	                else if( j == 1 )
                		System.out.print("s"); 
	                else if( j == n )
                		System.out.print("s"); 
                               
	                		     
	                else
	                    System.out.print("*");             
	            } 
	            System.out.println(); 
	        } 

	}

}

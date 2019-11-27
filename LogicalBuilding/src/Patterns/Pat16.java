package Patterns;

public class Pat16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		 for (i = 1; i <= n; i++) 
	        { 
	            for (j = 1; j <= n; j++) 
	            { 
	            	
	                if (i ==j || i+j==n+1) 
	                              
	                    System.out.print("*");             
	                else
	                    System.out.print(0);             
	            } 
	            System.out.println(); 
	        } 

	}

}

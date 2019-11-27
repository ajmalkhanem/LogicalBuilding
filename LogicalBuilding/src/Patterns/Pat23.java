package Patterns;

public class Pat23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n=6;
		 for (i = 1; i <= n; i++) 
	        { 
	            for (j = 1; j <= n; j++) 
	            { 
	                if (i == 1) 
	                	 System.out.print("c"); 
	                else if( i == n )
	                		System.out.print("k"); 
	                else if( i == n-2 )
               		System.out.print("s"); 
	                else if( i == n-3 )
               		System.out.print("s"); 
                              
	                		     
	                else
	                    System.out.print("*");             
	            } 
	            System.out.println(); 
	        } 
	}

}

package Patterns;

public class Pat11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5,m=6;
		 for (i = 1; i <= n; i++) 
	        { 
	            for (j = 1; j <= m; j++) 
	            { 
	                if (i == 1 || i+j == n+1 ||  
	                    i == n )             
	                    System.out.print("*"); 
	                
	                else
	                    System.out.print(" ");             
	            } 
	            
	            System.out.println(); 
	        } 
		 

	}

}

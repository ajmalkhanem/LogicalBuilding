package Patterns;

public class Pat15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,i,j,k;
		for (i = 0; i <n; i++) 
        { 
            for (j = 0; j <= i; j++) 
            { 	
            	
            		System.out.print("*");
            }
            System.out.print(" ");
            		for( k=0;k<=i;k++)
            		{
            			System.out.print("*");
            		}
            		System.out.println();
			}
			
		}
	}



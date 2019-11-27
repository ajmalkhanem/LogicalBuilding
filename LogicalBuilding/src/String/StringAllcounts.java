package String;

import java.util.Scanner;

public class StringAllcounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String stt = s.nextLine(); // read a string from user side
		String[] data = stt.split(" "); // store strings ton the array word by word
		int i = 0;
		char c=0;
		int cn=0,cn1=0,cn2=0,upper=0,lower=0,space=0;
		for (i = 0; i < data.length; i++) // here the index star from 0
		{
			
			int l=data[i].length();
			for(int j=0;j<l;j++)
			{
		      c=data[i].charAt(j);
		      if (c==32) 
			     {
			            space++; 
			     }
		     
		     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		     {
		    	 cn++;
		     }
		     if (Character.isDigit(c)) {
		         cn1++;
		     }
		     
		     if (65 <= c && c<=90) 
		     {
		            upper++; 
		     }
		     
		     
		     if ((33 <= c && c<=47) ||( 58 <= c && c<=64 ) || ( 123 <= c && c<=126 ) || ( 91 <= c && c<=96))
		     {
		            cn2++; 
		     }
		     
		     
		     if (96 <= c && c<=122) 
		     {
		            lower++; 
		     }
		    
		     
			}
			
		
		}System.out.println( "Vowels " +cn);
		System.out.println( "NUmbers " +cn1);
		System.out.println("Special Char "+cn2);
		System.out.println("Upper "+upper);
		System.out.println("lower "+lower);
		System.out.println("Spaces "+space);
		
	}

}

package String;

import java.awt.im.InputContext;
import java.util.Scanner;

public class StringCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		StringBuilder c = new StringBuilder();
		
		String st = "qwertyuiop asdfghjkl; zxcvbnm,./"; //assign the letters to the string
		char ch1[] = st.toCharArray();             // assign  string to the char array
		
		System.out.println("Enter a character");   // read the shifting pattern
		char shift = s.next().charAt(0);
		
		System.out.println("Enter the string");  //read the entered string
		String str = s.next();                  
		char ch2[] = str.toCharArray();    //assign string to the array  
		
		
		System.out.println("The original message");
		
		for (int i = 0; i < str.length(); i++)  //loop for entered string
		{
			char chrr = str.charAt(i);
			
			for (int j = 0; j < ch1.length; j++)  //loop for letters 
			{
				if (ch2[i] == (ch1[j]) && shift == 'R')
				{
					c.append(ch1[j - 1]);
				}
				if (ch2[i] == (ch1[j]) && shift == 'L')
				{
					c.append(ch1[j + 1]);
				}
			}

		}
		System.out.println(c);
	}

}

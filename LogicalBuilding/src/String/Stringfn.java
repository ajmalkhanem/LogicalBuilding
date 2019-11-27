package String;

import java.util.Scanner;

public class Stringfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String st = "Ajmal";
		String str = "Ajmal Khan";

		System.out.println("replace " + st.replace("A", "a"));
		System.out.println("length " + st.length());
		System.out.println("substring " + st.substring(2, 4));
		System.out.println("index " + st.indexOf("m"));
		System.out.println("concat " + str.concat(st));
		System.out.println("charAt " + str.charAt(2));
		System.out.println("uppercase " + st.toUpperCase());
		System.out.println("lowercase " + st.toLowerCase());

		// using split method

		String stt = s.nextLine(); // read a string from user side
		String[] data = stt.split(" "); // store strings ton the array word by word
		int i = 0;
		for (i = 0; i < data.length; i++) // here the index star from 0
		{
			if (i % 2 != 0) // here check the position
			{
		        int l=data[i].length();//here asign the each odd position words length
		        
				for (int j = l- 1; j >= 0; j--) 
				{
					System.out.print(data[i].charAt(j)); // reverse the string
					
				}
				System.out.println(" ");// print space
			}
			else
			{
				System.out.println(data[i]+" ");// print remaining words
			}

		}
		

	}

}

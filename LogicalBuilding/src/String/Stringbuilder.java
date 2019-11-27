package String;

import java.util.Scanner;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		StringBuilder s1= new StringBuilder();
		System.out.println("enter your name");
		s1.append("Name  "+s.next()+"\n");
		System.out.println("enter your id");
		s1.append("id  "+ s.next()+"\n");
		System.out.println("enter your age");
		s1.append("Age  "+s.next()+"\n");	
		System.out.println("enter your gender");
		s1.append("Gender "+s.next()+"\n");
		hai(s1);
		
		
		// here use some functions of string builder class
		
		StringBuilder sb= new StringBuilder("amal");
		System.out.println("before insertion : "+sb);
		sb.insert(1, "j");
		System.out.println("after insertion of j : "+sb);
		sb.replace(0, 4, "welcome");
		System.out.println("after replace : "+sb);
        sb.deleteCharAt(7);
        System.out.println("after deletion of last char : "+sb);
	}

	private static void hai(StringBuilder s) {
		// TODO Auto-generated method stub
		System.out.println("Employe details :");
		System.out.println(s);
		
		
	}

	
}

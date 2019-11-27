package String;
import java.util.regex.*;
import java.util.Scanner;

public class UsePas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String username=s.next();
		String password=s.next();
		
		String regus="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  //pattern for user name
		String regpas="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";                                                        //pattern for password
		
		System.out.println(username);      
		System.out.println(password);
		
		Pattern us=Pattern.compile(regus);      //checking username pattern
		Matcher m=us.matcher(username);
		
		Pattern psw=Pattern.compile(regpas);    //checking password pattern
		Matcher m1=psw.matcher(password);
		
		if(m.matches())                       //user name valid or not
		{
			System.out.println("valid userid");
			
		}
		else
		{
			System.out.println("invalid userid");
			
		}
		if(m1.matches())           //password is valid or not
		{
			System.out.println("valid password");
			
		}
		else
		{
			System.out.println("invalid password");
			
		}
		
	}

}

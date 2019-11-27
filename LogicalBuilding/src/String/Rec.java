package String;
import java.util.Scanner;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String pr;
		do
		{
		System.out.println("Menu");
		System.out.println("1.booked\n2.Status\n3.exit");
		System.out.println("enter your option");
        int op=s.nextInt();
        Book n=new Book();
        switch(op)
        {
        case 1:
		   n.book();
		   break;
        case 2:
        	n.Status();
        	break;
        case 3:
        	System.exit(0);
        }System.out.println("Do u want contnue");
        pr=s.next();
		}while(pr.equals("no"));

	}

}

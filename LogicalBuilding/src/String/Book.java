package String;
import java.util.Scanner;

public class Book
{
public static int booked[]=new int[25];
static void book() {
	String ac;
	String cot;
	String cable;
	String wifi;
	String la;
	String pro;
	Scanner sc=new Scanner(System.in);
	int total,b=0,c,d,e,f,i=1;
	do
	{
	System.out.println("Booking");
	System.out.println("please choose the service required");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=sc.next();
	if(ac.contentEquals("AC")==true)
	{
		b=1500;
	}
	else
	{
		b=700;
	}
	System.out.println("Cot(Single/Double)");
	cot=sc.next();
	if (cot.contentEquals("single")==true)
	{
		c=50;
	}
	else
	{
		c=100;
	}
	System.out.println("with cable connection/without cable connection");
	cable=sc.next();
	if(cable.equals("c")==true)
	{
		d=50;
	}
	else
	{
		d=0;
	}
	System.out.println("with wifi connection/without wifi connection");
	wifi=sc.next();
	if(wifi.equals("w")==true)
	{
		e=150;
	}
	else
	{
		e=0;
	}
	System.out.println("with laundry/without laundry");
	la=sc.next();
	if(la.equals("L")==true)
	{
		f=300;
	}
	else
	{
		f=0;
	}
	total=b+c+d+e+f;
	System.out.println("the total charge is Rs."+total);
	System.out.println("the service chosen are");
	if(b==1500)
	{
		System.out.println("Ac");
	}
	else
	{
		System.out.println("non-Ac");
	}
	if(c==50)
	{
		System.out.println("single cot");
	}
	else
	{
		System.out.println("double cot");
	}
	if(d!=50)
	{
		System.out.println("cable connection enabled");
	}
	else
	{
		System.out.println("cable connection not enabled");
	}
	if(e!=0)
	{
		System.out.println("with wifi connection");
	}
	else
	{
		System.out.println("with out wifi connection");
	}
	if(f!=0)
	{
		System.out.println("with laundry service");
	}
	else
	{
		System.out.println("without laundry service");
	}
	{
		System.out.println("Do you want to proceed");
	}
	 pro=sc.next();
	if(pro.equals("yes")==true)
	{
		booked[i]=1;
		System.out.println("Thank u your room is"+i);
		i=i++;
	}}while(pro.equals("no"));
}
public void Status()
{

	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int f=0;
	for(int i=0;i<25;i++)
	{
		if(booked[i]==a )
		{
			f=1;
			break;
		}
		else
			f=0;
	}
	if(f==1)
	{
		System.out.println("Room is not available");
	}
	else
	{
		System.out.println("Room is available");
	}
		
	
	}
}
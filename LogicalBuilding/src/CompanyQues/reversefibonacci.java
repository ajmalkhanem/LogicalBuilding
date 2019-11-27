package CompanyQues;
import java.util.Scanner;
public class reversefibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int oct=0,r=0,i=1;
		while(n!=0)
		{
			r=n%8;
			oct=oct+(r*i);
			n=n/8;
			i=i*10;
		}
		System.out.println(oct);

	}

}

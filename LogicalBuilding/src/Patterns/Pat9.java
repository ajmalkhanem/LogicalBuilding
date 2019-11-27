package Patterns;

public class Pat9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int al=65;
		for (int i = 4; i>=0; i--) {

			for (int j = i; j>=0; j--) {
				
				System.out.printf("%c",j+al);
				

			}
			System.out.println();
		}


	}

}

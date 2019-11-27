package Patterns;

public class Pat10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, j, k;
		for (i = 1; i <= 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 3; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (i = 4-1; i >=0 ; i--) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 3; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

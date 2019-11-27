package Patterns;

public class Pat18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = i; k >0; k--) {
				System.out.print(k+" ");
			}
			System.out.println("");
		}

	}

}

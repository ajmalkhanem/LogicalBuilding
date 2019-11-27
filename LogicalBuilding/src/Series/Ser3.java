package Series;

public class Ser3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		float b=2,c=3,d,e,a=1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for (int i = 1; i < n; i++) {

			if (i % 2 != 0) {
				d = b*3;
				
				System.out.println(d);
				b=d;
			} else {
				e = c*3;
				
				System.out.println(e);
				c=e;
			}
			// System.out.println(i);

		}
	}

}

package problem1;

public class Problem3 {

	public static void main(String[] args) {
		// 1/3をn回かける数列の和
		double a = 1.0;
		int n = 0;
		double s = 0;
		while (a >= 1e-5) {
			n++;
			a = a * 1 / 3;
			s = s + a;
		}

		System.out.printf("n=%d s=%.6e", n, s);
	}

}

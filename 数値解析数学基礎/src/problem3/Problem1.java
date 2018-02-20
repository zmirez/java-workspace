package problem3;

public class Problem1 {

	public static void main(String[] args) {
		double eps = 1e-12;
		double a = -2;
		double b = 0;
		int n = 0;
		while ((Math.abs(b - a) / (Math.pow(2, n + 1))) > eps) {
			n++;
		}
		System.out.println(n);

	}

}

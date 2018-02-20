package problem3;

public class Problem2 {
	// 二分法の正しいやつ

	public static void main(String[] args) {
		double a = 0.01;
		double b = 2.0;
		double c = 0.0;
		double eps = 1e-12;
		int n = 0;
		// 解を求めてるよ
		while ((Math.abs(b - a) / 2) > eps) {
			c = (a + b) / 2;
			n++;
			double fa = f(a);
			double fc = f(c);
			if (fa * fc > 0) {
				a = c;
			} else if (fa * fc < 0) {
				b = c;
			} else {
				break;
			}
		}
		System.out.println(c);
		// 反復回数
		/*
		 * n = (int) ((Math.log(Math.abs(b - a) / eps)) / (Math.log(2)));
		 */
		System.out.println(n);

	}

	public static double f(double x) {
		return (Math.pow(Math.E, x) - 2 * x - 1);
	}

}

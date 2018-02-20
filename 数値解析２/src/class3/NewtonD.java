package class3;

public class NewtonD {

	public static void main(String[] args) {
		double x0 = 3.0;
		double x = 0.0;
		int M = 200;
		double[] X = new double[M];

		int N = 0;
		double eps = 1e-12;
		for (int i = 1;; i++) {
			if (i > M) {
				System.out.println("収束しない");
				break;
			}
			x = x0 - bf(x0, 5, 100) / dbf(x0, 5);
			x0 = x;
			X[i - 1] = x;
			if (Math.abs(bf(x, 5, 100)) < eps) {
				System.out.println("反復回数は" + i);
				N = i;
				System.out.println("近似解は" + x);
				break;
			}
		}
		for (int i = 1; i < N; i++) {
			double sum = Math.abs(X[i - 1] - X[N - 1]);
			System.out.println(sum);
		}
	}

	public static double f(double x) {
		return (Math.pow(Math.E, x) - 3 * x);
	}

	public static double df(double x) {
		return (Math.pow(Math.E, x) - 3);
	}

	public static double af(double x) {
		return Math.pow(Math.E, (x - 1)) - x;
	}

	public static double daf(double x) {
		return Math.pow(Math.E, (x - 1)) - 1;
	}

	public static double bf(double x, int k, int a) {
		return Math.pow(x, k) - a;
	}

	public static double dbf(double x, int k) {
		return k * Math.pow(x, k - 1);
	}
}

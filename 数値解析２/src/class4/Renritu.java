package class4;

public class Renritu {

	public static void main(String[] args) {
		double x1 = 0;
		double x2 = 0;
		double eps = 1e-12;
		int M = 200;
		for (int i = 1; i < M; i++) {

		}

	}

	public static double[] f(double x, double y) {
		double[] f = new double[2];
		f[0] = x * x + y * y - 1;
		f[1] = Math.sin(x) + y * y;
		return f;
	}

	public static double[][] J(double x, double y) {
		double[][] J = new double[2][2];
		J[0][0] = 2 * x;
		J[0][1] = 2 * y;
		J[1][0] = Math.cos(x);
		J[1][1] = 2 * y;
		return J;

	}

}

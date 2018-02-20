package class5;

import MyBlass.Calc;

public class Renritsu {

	public static void main(String[] args) {
		double x1 = -1.0;
		double x2 = -1.0;
		double x3 = 1.0;
		double eps = 1e-10;
		int M = 50;
		double[] x = new double[3];
		double[] y = new double[3];
		x[0] = x1;
		x[1] = x2;
		x[2] = x3;

		for (int n = 0;; n++) {
			if (n > M) {
				System.out.println("収束しない");
				break;
			}
			y = Calc.addVec(x, pivotgauss(x[0], x[1], x[2]));

			if (Calc.vecNormInf(Calc.subVec(y, x)) <= eps) {
				System.out.println("反復回数は" + (n + 1));
				Calc.printVec(y);
				break;
			}
			x = y;

		}

	}

	public static double[] f(double x, double y, double z) {
		double[] f = new double[3];
		f[0] = -(x * x + y * y + z * z - 1);
		f[1] = -(Math.sin(x) + y * y + z * z);
		f[2] = -(x * x + Math.sin(y) + z * z);
		return f;
	}

	public static double[][] J(double x, double y, double z) {
		double[][] J = new double[3][3];
		J[0][0] = 2 * x;
		J[0][1] = 2 * y;
		J[0][2] = 2 * z;
		J[1][0] = Math.cos(x);
		J[1][1] = 2 * y;
		J[1][2] = 2 * z;
		J[2][0] = 2 * x;
		J[2][1] = Math.cos(y);
		J[2][2] = 2 * z;
		return J;

	}

	public static double[] pivotgauss(double x1, double x2, double x3) {
		double[][] a = J(x1, x2, x3);
		double[] b = f(x1, x2, x3);
		double sum = 0;
		double[] x = new double[b.length];
		for (int k = 0; k < a.length; k++) {
			for (int i = k + 1; i < a.length; i++) {
				if (Math.abs(a[i][k]) > Math.abs(a[k][k])) {
					double c = b[k];
					b[k] = b[i];
					b[i] = c;
					for (int j = k; j < a.length; j++) {
						double d = a[k][j];
						a[k][j] = a[i][j];
						a[i][j] = d;
					}
				}
			}
			for (int i = k + 1; i < a.length; i++) {
				double alpha = a[i][k] / a[k][k];
				for (int j = k + 1; j < a.length; j++) {
					a[i][j] = a[i][j] - alpha * a[k][j];

				}
				b[i] = b[i] - alpha * b[k];
			}
		}
		for (int k = a.length - 1; k >= 0; k--) {
			for (int j = k + 1; j < a.length; j++) {
				sum = a[k][j] * x[j];
			}
			x[k] = (b[k] - sum) / a[k][k];
		}
		return x;

	}

}

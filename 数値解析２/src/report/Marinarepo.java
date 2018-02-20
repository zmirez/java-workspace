package report;

import MyBlass.Calc;

public class Marinarepo {
	public static void main(String[] args) {
		double[][] A = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 },
				{ 5, 6, 7, 8, 9 } };
		double[] b = { 1, 1, 1, 1, 1 };
		double[] x = Pivot(A, b);
		double[] x1 = Gauss(A, b);
		Calc.printVec(x);
		Calc.printVec(x1);
	}

	public static double[] Gauss(double[][] A, double[] b) {
		double x[] = new double[A.length];
		for (int k = 1; k < A.length; k++) {
			for (int i = k + 1; i <= A.length; i++) {
				double a = (A[i - 1][k - 1]) / (A[k - 1][k - 1]);
				b[i - 1] = b[i - 1] - a * b[k - 1];
				for (int j = k; j <= A.length; j++) {
					A[i - 1][j - 1] = A[i - 1][j - 1] - a * A[k - 1][j - 1];
				}
			}
		}

		for (int k = A.length; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < A.length + 1; j++) {
				sum = sum + A[k - 1][j - 1] * x[j - 1];
			}
			x[k - 1] = (1 / A[k - 1][k - 1]) * (b[k - 1] - sum);
		}

		return x;
	}

	public static double[] Pivot(double[][] A, double[] b) {

		double[] x = new double[A.length];
		double[] x1 = new double[A.length];

		double alpha = 0;
		double y = 0;
		double c = 0;
		for (int k = 0; k < A.length - 1; k++) {
			for (int i = k + 1; i < A.length; i++) {
				if (Math.abs(A[i][k]) > A[k][k]) {
					c = b[i];
					b[i] = b[k];
					b[k] = c;
					for (int j = k; j < A.length; j++) {
						y = A[i][j];
						A[i][j] = A[k][j];
						A[k][j] = y;

					}
				}

			}
			for (int i = k + 1; i < A.length; i++) {
				alpha = A[i][k] / A[k][k];
				for (int j = k + 1; j < A.length; j++) {
					A[i][j] = A[i][j] - alpha * A[k][j];

				}
				b[i] = b[i] - alpha * b[k];
			}

		}
		for (int k = A.length; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < A.length + 1; j++) {
				sum = sum + A[k - 1][j - 1] * x1[j - 1];
			}
			x1[k - 1] = (1 / A[k - 1][k - 1]) * (b[k - 1] - sum);
		}
		for (int i = 0; i < A.length; i++) {
			b[0] += A[0][i];
		}

		return x1;

	}

}

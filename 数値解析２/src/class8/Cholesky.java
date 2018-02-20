package class8;

import MyBlass.Calc;

public class Cholesky {

	public static void main(String[] args) {
		double[][] A = { { 1, -1, 2, 1, -1 }, { -1, 5, -4, 3, 4 }, { 2, -4, 14, -3, 1 }, { 1, 3, -3, 10, -4 },
				{ -2, 4, 1, -4, 11 } };
		double[] b = { 1, 1, 1, 1, 1 };
		// cholesky(A, b);
		Calc.printMat(A);
		System.out.println();
		Calc.printMat(Calc.transpose(A));

	}

	public static void cholesky(double[][] A, double[] b) {
		int n = A.length;
		double[][] l = new double[n][n];
		double[] y = new double[n];
		double[] x = new double[n];
		double[][] lt = new double[n][n];
		double s = 0;

		// コレスキー分解
		for (int j = 0; j < n; j++) {
			for (int i = j; i < n; i++) {
				s = 0;
				for (int k = 0; k < j; k++) {
					s = s + l[i][k] * l[j][k];
				}
				if (i == j) {
					l[i][i] = Math.sqrt(A[i][i] - s);
				} else {
					l[i][j] = (A[i][j] - s) / l[j][j];
				}
			}

		}
		Calc.printMat(l);
		for (int k = 0; k < n; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += l[k][j] * y[j];
			}
			y[k] = (b[k] - sum) / l[k][k];
		}
		Calc.printVec(y);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				lt[i][j] = l[j][i];
			}
		}
		for (int k = n - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < n; j++) {
				sum += lt[k][j] * x[j];
			}
			x[k] = (1 / lt[k][k]) * (y[k] - sum);

		}
		Calc.printVec(x);

	}

}

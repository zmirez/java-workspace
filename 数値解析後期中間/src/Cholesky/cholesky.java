package Cholesky;

import MyBlass.Calc;

public class cholesky {
	public static void main(String[] args) {
		double[][] A = { { 4, -2, 2, 0, 0 }, { -2, 11, -4, -6, 0 }, { 2, -4, 6, 0, 4 }, { 0, -6, 0, 21, -10 },
				{ 0, 0, 4, -10, 44 } };
		double[] b = { 1, 1, 1, 1, 1 };
		Cholesky(A, b);

	}

	public static void Cholesky(double[][] A, double[] b) {
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
		// 解出すやつ
		for (int k = 0; k < n; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += l[k][j] * y[j];
			}
			y[k] = (b[k] - sum) / l[k][k];
		}
		// Calc.printVec(y);
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
		// Calc.printVec(x);

	}

}

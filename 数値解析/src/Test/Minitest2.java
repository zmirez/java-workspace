package Test;

import MyBLAS.Calc;

public class Minitest2 {

	public static void main(String[] args) {
		int n = 3;
		double[][] a = { { 1.0e-15, 2.0, 0 }, { 2.0, 2.0, 2.0 }, { 0, 2.0, 1.0e+15 } };
		double[] x = { 1.0, 1.0, 1.0 };

		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i] += a[i][j];
			}
			System.out.println(b[i]);
		}
		double[] x1 = new double[a.length];
		/* LU分解 */
		for (int k = 0; k < n; k++) {
			for (int i = k + 1; i < n; i++) {
				double alpha = a[i][k] / a[k][k];
				for (int j = k + 1; j < n; j++) {
					a[i][j] = a[i][j] - alpha * a[k][j];
				}
				a[i][k] = alpha;
			}
		}
		double[] y = new double[a.length];
		for (int k = 0; k < a.length; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += a[k][j] * y[j];
			}
			y[k] = b[k] - sum;
		}
		for (int k = n - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < n; j++) {
				sum += a[k][j] * x1[j];
			}
			x1[k] = (1 / a[k][k]) * (y[k] - sum);
			// System.out.println(x1[k]);
		}
		double[][] A = { { 1.0e-15, 2.0, 0 }, { 2.0, 2.0, 2.0 }, { 0, 2.0, 1.0e+15 } };

		System.out.println(Calc.vecNormInf(Calc.subVec(b, Calc.matVec(A, x1))) / Calc.vecNormInf(b));
		System.out.println(Calc.vecNormInf(Calc.subVec(x, x1)) / Calc.vecNormInf(x));

	}

}

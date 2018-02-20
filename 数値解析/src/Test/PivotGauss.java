package Test;

import MyBLAS.Calc;

public class PivotGauss {

	public static void main(String[] args) {
		int n = 8;
		double[][] a = new double[n][n];
		double[] b = new double[n];
		double[] db = new double[n];
		double[] x = new double[n];
		double[] x1 = new double[n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = 1 / (i + j + 1.0);
			}
			x[i] = 1.0;
		}
		for (int i = 0; i < b.length; i++) {
			db[i] = 0;
			for (int j = 0; j < a.length; j++) {
				b[i] += a[i][j];
			}
		}
		db[0] = 0.001 * b[0];
		b[0] = b[0] + db[0];
		double alpha = 0;
		double y = 0;
		double c = 0;
		for (int k = 0; k < a.length - 1; k++) {
			for (int i = k + 1; i < a.length; i++) {
				if (Math.abs(a[i][k]) > a[k][k]) {
					c = b[i];
					b[i] = b[k];
					b[k] = c;
					for (int j = k; j < a.length; j++) {
						y = a[i][j];
						a[i][j] = a[k][j];
						a[k][j] = y;

					}
				}

			}
			for (int i = k + 1; i < a.length; i++) {
				alpha = a[i][k] / a[k][k];
				for (int j = k + 1; j < a.length; j++) {
					a[i][j] = a[i][j] - alpha * a[k][j];

				}
				b[i] = b[i] - alpha * b[k];
			}

		}
		for (int k = n; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < n + 1; j++) {
				sum = sum + a[k - 1][j - 1] * x1[j - 1];
			}
			x1[k - 1] = (1 / a[k - 1][k - 1]) * (b[k - 1] - sum);
		}
		for (int i = 0; i < a.length; i++) {
			b[0] += a[0][i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%.3e", x1[i]);
		}
		System.out.println();
		System.out.printf("%.3e", Calc.vecNorm1(Calc.subVec(x, x1)) / Calc.vecNorm1(x));
		System.out.println();
		System.out.printf("%.3e", 3.3872791483426445e+10 * (Calc.vecNorm1(db) / Calc.vecNorm1(b)));
	}
}
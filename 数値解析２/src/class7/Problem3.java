package class7;

import MyBlass.Calc;

public class Problem3 {
	// SOR法

	public static void main(String[] args) {
		int N = 5;
		double[][] A = new double[N][N];
		double[] x = new double[N];
		double[] b = new double[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					A[i][j] = 2.0;
				} else if (Math.abs(i - j) >= 2) {
					A[i][j] = 0.0;
				} else {
					A[i][j] = -1.0;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			x[i] = 1.0;
			b[i] = 1.0;
		}
		SOR(A, x, b);

	}

	public static void SOR(double[][] A, double[] x0, double[] b) {
		int M = 1000;
		double eps = 1e-10;

		for (double i1 = 1.0; i1 < 100; i1++) {

			double[] xm = new double[x0.length];
			double[] x = new double[x0.length];
			double omg = 0;
			int count = 0;
			while (true) {
				if (count > M) {
					// System.out.println(i1 + "は収束しない");
					break;
				}
				for (int i = 0; i < A.length; i++) {
					double sum = 0;
					for (int j = 0; j < b.length; j++) {
						if (i > j)
							sum += A[i][j] * xm[j];
						if (i < j)
							sum += A[i][j] * x[j];
					}
					xm[i] = (b[i] - sum) / A[i][i];
					omg = i1 * 2.0 / 100;
					xm[i] = omg * xm[i] + (1 - omg) * x[i];
				}

				if (Calc.vecNorm2(Calc.subVec(xm, x)) < eps) {
					// Calc.printVec(xm);
					// System.out.println(count);
					break;
				}
				for (int i = 0; i < x.length; i++) {
					x[i] = xm[i];
				}
				count++;
			}
			System.out.println(omg);
		}

	}
}

package JGS;

import MyBlass.Calc;

public class Jacobi {
	// Jacobi法

	public static void main(String[] args) {
		int N = 5;// 要素数
		int M = 100;// 最大反復回数
		double eps = 1.0e-8;
		int count = 0;
		double[][] A = { { 3, -1, 0, 0, 0 }, { -2, 3, -1, 0, 0 }, { 0, -2, 3, -1, 0 }, { 0, 0, -2, 3, -1 },
				{ 0, 0, 0, -2, 3 } };
		double[] x = new double[N];
		double[] b = new double[N];
		double[] xm = new double[N];

		/*
		 * for (int i = 0; i < N; i++) { for (int j = 0; j < N; j++) { if (i ==
		 * j) { A[i][j] = 3.0; } else if (Math.abs(i - j) > 2) { A[i][j] = 0.0;
		 * } else { A[i][j] = -1.0; } } }
		 */
		// Calc.printMat(A);
		for (

		int i = 0; i < N; i++) {
			x[i] = 1.0;
			b[i] = 1.0;
			xm[i] = 0.0;
		}

		while (true) {
			if (count > M) {
				System.out.println("収束しない");
				break;
			}
			for (int i = 0; i < N; i++) {
				double sum = 0;
				for (int j = 0; j < N; j++) {
					if (i != j) {
						sum += A[i][j] * x[j];
					}
				}
				xm[i] = (b[i] - sum) / A[i][i];

			}
			if (Calc.vecNorm2(Calc.subVec(xm, x)) < eps) {
				Calc.printVec(xm);
				System.out.println(count);
				break;
			}
			for (int i = 0; i < N; i++) {
				x[i] = xm[i];
			}
			count++;
		}

	}

}

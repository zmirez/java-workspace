package Test;

import MyBLAS.Calc;

public class GaussSeidel {

	public static void main(String[] args) {

		double eps = 1.0e-7;
		double[][] A = { { 3.0, 1.0, -1.0 }, { 1.0, -4.0, 2.0 }, { 2.0, -1.0, 5.0 } };
		// double[][] A = { { 10.0, -1.0, 2.0, 0.0 }, { -1.0, 11.0, -1.0, 3.0 },
		// { 2.0, -1.0, 10.0, -1.0 },
		// { 0.0, 3.0, -1.0, 8.0 } };
		double[] b = { 0.0, 24.0, 14.0 };
		// double[] b = { 6.0, 25.0, -11.0, 15.0 };
		Calc.printVec(b);
		Calc.printVec(Gausssiedel(A, b, eps));

	}

	public static double[] Gausssiedel(double[][] A, double[] b, double eps) {
		int n = A.length;
		double[] x_0 = new double[n];
		double[] x = new double[n];
		double dx = 0;
		double Nx = 0;

		long count = 0;
		int M = 2000;
		for (int i = 0; i < x.length; i++) {
			x_0[i] = 1.0;
			x[i] = 0.0;
		}

		while (true) {
			// Calc.printVec(x_0);
			for (int i = 0; i < n; i++) {
				double sum = 0;
				for (int j = 0; j < n; j++) {
					if (j < i)
						sum += A[i][j] * x[j];
					else if (j > i) {
						sum += A[i][j] * x_0[j];
					}
				}
				x[i] = (b[i] - sum) / A[i][i];
				dx += Math.abs(x[i] - x_0[i]);
				Nx += Math.abs(x[i]);

			}

			if (dx / Nx < eps) {
				System.out.println("反復回数=" + count);
				break;
			}
			x_0 = x;
			count++;

		}
		return x;
	}

}

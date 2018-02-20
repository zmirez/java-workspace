package Test;

import MyBLAS.Calc;

public class Jacobi {

	public static void main(String[] args) {
		int n = 4;
		double eps = 1.0e-8;
		double[][] A = { { 10.0, -1.0, 2.0, 0.0 }, { -1.0, 11.0, -1.0, 3.0 }, { 2.0, -1.0, 10.0, -1.0 },
				{ 0.0, 3.0, -1.0, 8.0 } };
		double[] b = { 6.0, 25.0, -11.0, 15.0 };
		// double[][] A = { { 3.0, 1.0, -1.0 }, { 1.0, -4.0, 2.0 }, { 2.0, -1.0,
		// 5.0 } };
		// double[] b = { 0.0, 24.0, 14.0 };
		// Calc.printVec(b);
		int N = 10;
		double[][] B = new double[N][N];
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = 1.0;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					B[i][j] = 2.0;
				} else if (Math.abs(i - j) > 2) {
					B[i][j] = 0.0;
				} else {
					B[i][j] = -1.0;
				}
			}
		}

		Calc.printVec(Jacobi(B, a, eps));

	}

	public static double[] Jacobi(double[][] A, double[] b, double eps) {
		int n = A.length;
		double[] x_0 = new double[n];
		double[] x = new double[n];
		double dx = 0;
		double Nx = 0;
		int count = 0;
		int M = 500;
		for (int i = 0; i < x.length; i++) {
			x_0[i] = 1.0;
			x[i] = 0.0;
		}
		while (true) {
			for (int i = 0; i < n; i++) {
				double sum = 0;
				for (int j = 0; j < n; j++) {
					if (i != j) {
						sum += A[i][j] * x_0[j];
					}
				}
				x[i] = (b[i] - sum) / A[i][i];
				dx += Math.abs(x[i] - x_0[i]);
				Nx += Math.abs(x[i]);

			}

			if (dx / Nx <= eps) {
				System.out.println("反復回数=" + count);
				break;
			}
			x_0 = x;
			count++;
		}
		return x;
	}

}

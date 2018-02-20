package Test;

import MyBLAS.Calc;

public class Minitest {

	public static void main(String[] args) {

		double[][] A = { { Math.pow(10, -15), 2.0, 0 }, { 2.0, 2.0, 2.0 }, { 0, 2.0, Math.pow(10, 15) } };
		double[][] A_inv = new double[3][3];
		A_inv = InvertMatrix(A);
		System.out.println(Calc.matNormInf(A) * Calc.matNormInf(A_inv));

	}

	public static double[][] LU(double a[][]) {
		double[][] A = new double[a.length][a.length];
		double alpha = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				A[i][j] = a[i][j];
			}
		}
		for (int k = 0; k < a.length - 1; k++) {
			for (int i = k + 1; i < a.length; i++) {
				alpha = A[i][k] / A[k][k];
				A[i][k] = alpha;
				for (int j = k + 1; j < a.length; j++) {
					A[i][j] = A[i][j] - alpha * A[k][j];
				}
			}
		}
		return A;
	}

	public static double[] Forwardsub(double A[][], double b[]) {
		double[] y = new double[b.length];
		for (int k = 0; k < A.length; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += A[k][j] * y[j];
			}
			y[k] = b[k] - sum;
		}
		return y;
	}

	public static double[] Backsub(double A[][], double b[]) {
		double[] x = new double[b.length];
		for (int k = A.length - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < A.length; j++) {
				sum += A[k][j] * x[j];
			}
			x[k] = (1 / A[k][k]) * (b[k] - sum);

		}
		return x;

	}

	public static double[][] InvertMatrix(double a[][]) {
		double[][] A_inv = new double[a.length][a.length];
		double[][] A = LU(a);
		double[] y = new double[a.length];
		double[] x = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			double[] e_i = new double[a.length];
			for (int j = 0; j < a.length; j++) {
				if (i == j)
					e_i[j] = 1.0;
				else
					e_i[j] = 0;
			}
			y = Forwardsub(A, e_i);
			x = Backsub(A, y);
			for (int j = 0; j < a.length; j++) {
				A_inv[i][j] = x[j];
			}
		}
		return A_inv;

	}

}

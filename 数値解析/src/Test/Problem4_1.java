package Test;

import MyBLAS.Calc;

public class Problem4_1 {

	public static void main(String[] args) {
		double A[][] = new double[6][6];
		double x[] = new double[6];
		double x1[] = new double[6];
		double b[] = new double[6];
		for (int i = 0; i < A.length; i++) {
			x[i] = 1.0;
			for (int j = 0; j < A.length; j++) {
				A[i][j] = (0.1 / (i + j + 1.0)) + (i - j + 2.0);
				b[i] += A[i][j] * x[i];
			}
			System.out.printf("%.3e", b[i]);
			System.out.println();
		}
		// b[0] = b[0] * 1.001;
		for (int k = 1; k < 6; k++) {
			for (int i = k + 1; i <= 6; i++) {
				double a = (A[i - 1][k - 1]) / (A[k - 1][k - 1]);
				b[i - 1] = b[i - 1] - a * b[k - 1];
				for (int j = k; j <= 6; j++) {
					A[i - 1][j - 1] = A[i - 1][j - 1] - a * A[k - 1][j - 1];
				}
			}
		}

		for (int k = 5; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < 5 + 1; j++) {
				sum = sum + A[k - 1][j - 1] * x1[j - 1];
			}
			x1[k - 1] = (1 / A[k - 1][k - 1]) * (b[k - 1] - sum);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println();
				System.out.printf("%.3e ", A[i][j]);
				System.out.println();
			}
			System.out.println();
			System.out.print("b=");
			System.out.printf("%.3e ", b[i]);
			System.out.print("x=");
			System.out.printf("%.3e", x1[i]);
			System.out.println();
		}
		System.out.printf("%.3e", Calc.vecNormInf(Calc.subVec(x, x1)) / Calc.vecNormInf(x));
	}

}

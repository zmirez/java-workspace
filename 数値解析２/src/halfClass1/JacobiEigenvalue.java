package halfClass1;

import MyBlass.Calc;

public class JacobiEigenvalue {

	public static void main(String[] args) {
		int n = 5;
		double[][] A = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					A[i][j] = n + i + 1;
				else if (Math.abs(i - j) >= 3)
					A[i][j] = 0;
				else
					A[i][j] = -(i + j + 2 - n);
			}
		}
		// Calc.printMat(A);
		Givens(A);

	}

	public static void Givens(double[][] A) {
		int M = 200;
		double eps = 1.0e-10;
		int i = 0;
		int j = 0;
		double theta = 0;
		int f = 0;
		double b = 0;
		double c = 0;
		double s = 0;
		double count = 0;
		double[][] R = new double[A.length][A[0].length];
		double[][] Rt = new double[R.length][R[0].length];
		double[][] NA = new double[A.length][A[0].length];
		while (true) {
			if (count == M) {
				System.out.println("収束しない");
				break;
			}
			double max = 0;
			for (int k = 0; k < A.length; k++) {
				for (int m = k + 1; m < A.length; m++) {
					if (max < Math.abs(A[k][m])) {
						max = Math.abs(A[k][m]);
						i = k;
						j = m;

					}
				}
			}
			if (Math.abs(A[i][j]) < eps) {
				Calc.printMat(A);
				System.out.println("cos" + c + "sin" + s);
				System.out.println(count);
				break;
			}

			if (A[i][i] - A[j][j] >= 0) {
				f = 1;
			} else {
				f = -1;
			}
			b = (A[i][i] - A[j][j]) / 2.0;
			c = Math.sqrt((1.0 + f * (b / Math.sqrt(b * b + A[i][j] * A[i][j]))) / 2.0);
			s = f * A[i][j] / (2.0 * Math.sqrt(b * b + A[i][j] * A[i][j]) * c);
			if (A[i][i] == A[j][j]) {
				theta = Math.PI / 4.0;
				c = Math.cos(theta);
				s = Math.sin(theta);
			}

			for (int k = 0; k < R.length; k++) {
				for (int m = 0; m < R[0].length; m++) {
					if (k == m)
						R[k][k] = 1;
					else
						R[k][m] = 0;
				}
			}
			R[i][i] = c;
			R[j][j] = c;
			R[j][i] = s;
			R[i][j] = (-1) * s;
			Calc.printMat(R);
			Rt = Calc.transpose(R);
			double[][] Rtt = Calc.multipleMat(Rt, A);
			double[][] Rttt = Calc.multipleMat(Rtt, R);

			/*
			 * for (int k = 0; k < A.length; k++) { for (int m = 0; m <
			 * A[0].length; m++) { if (k == i && m == i) NA[i][i] = c * c *
			 * A[i][i] + 2 * c * s * A[i][j] + s * s * A[j][j]; else if (k == j
			 * && m == j) NA[j][j] = s * s * A[i][i] - 2 * c * s * A[i][j] + c *
			 * c * A[j][j]; else if (k != i && k != j) { NA[i][k] = NA[k][i] = c
			 * * A[i][k] + s * A[j][k]; NA[j][k] = NA[k][j] = s * A[i][k] - c *
			 * A[j][k]; } else if (k == i && m == j) { NA[i][j] = NA[j][i] = (c
			 * * c - s * s) * A[i][j] + c * s * (A[j][j] - A[i][i]); } else {
			 * NA[k][m] = A[k][m]; } } }
			 */

			for (int k = 0; k < A.length; k++) {
				for (int m = 0; m < A.length; m++) {
					A[k][m] = Rttt[k][m];
				}
			}

			count++;
		}

	}
}
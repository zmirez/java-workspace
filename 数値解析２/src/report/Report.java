package report;

import MyBlass.Calc;
import MyBlass.Matrix;

public class Report {
	// 後期冬休みレポート
	public static void main(String[] args) {
		double[] NA = new double[100];
		double[] nb = new double[100];
		for (int i = 0; i < 100; i++) {
			double[][] A = Matrix.makeMat(500);
			double[] b = Matrix.makeVec(500);
			NA[i] = Gauss(A, b);
			nb[i] = Pivot(A, b);
		}
		Calc.printVec(NA);
		Calc.printVec(nb);
	}

	public static double Gauss(double[][] A, double[] b) {
		double A1[][] = A;
		double b1[] = b;
		double x[] = new double[A.length];
		for (int k = 0; k < A.length - 1; k++) {
			for (int i = k + 1; i < A.length; i++) {
				double a = (A1[i][k]) / (A1[k][k]);
				b1[i] = b1[i] - a * b1[k];
				for (int j = k; j < A.length; j++) {
					A1[i][j] = A1[i][j] - a * A1[k][j];
				}
			}
		}

		for (int k = A.length - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < A.length; j++) {
				sum = sum + A1[k][j] * x[j];
			}
			x[k] = (b1[k] - sum) / A1[k][k];
		}

		double N = Calc.vecNorm2(Calc.subVec(b1, Calc.matVec(A1, x)));
		return N;
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println();
		 * System.out.print("b="); System.out.printf("%.3e ", b1[i]);
		 * System.out.print("x="); System.out.printf("%.3e", x[i]);
		 * System.out.println(); }
		 */
	}

	public static double Pivot(double[][] A, double[] b) {
		double[][] A1 = A;
		double[] b1 = b;
		double[] x1 = new double[A.length];
		double alpha = 0;
		double y = 0;
		double c = 0;
		for (int k = 0; k < A.length - 1; k++) {
			for (int i = k + 1; i < A.length; i++) {
				if (Math.abs(A1[i][k]) > Math.abs(A1[k][k])) {
					c = b1[i];
					b1[i] = b1[k];
					b1[k] = c;
					for (int j = k; j < A.length; j++) {
						y = A1[i][j];
						A1[i][j] = A1[k][j];
						A1[k][j] = y;

					}
				}

			}
			for (int i = k + 1; i < A.length; i++) {
				alpha = A1[i][k] / A1[k][k];
				b1[i] = b1[i] - alpha * b1[k];
				for (int j = k; j < A.length; j++) {
					A1[i][j] = A1[i][j] - alpha * A1[k][j];
				}

			}

		}
		for (int k = A.length - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < A.length; j++) {
				sum = sum + A1[k][j] * x1[j];
			}
			x1[k] = (b1[k] - sum) / A1[k][k];
		}
		/*
		 * for (int i = 0; i < A.length; i++) { b1[0] += A1[0][i]; }
		 */
		double N = Calc.vecNorm2(Calc.subVec(b1, Calc.matVec(A1, x1)));
		// System.out.println();
		return N;

	}
}

package MyBlass;

public class Calc {
	// 先生が授業中に作ったもの

	public static void printVec(double x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%.3e", x[i]);
		}
		System.out.println();

	}

	public static void printMat(double A[][]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.printf("%.3e", A[i][j]);
				System.out.print("");
			}
			System.out.println();
		}

	}

	public static double[] scalarMultiple(double c, double x[]) {
		double[] y = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			y[i] = x[i] * c;
		}
		return y;
	}

	public static double[] addVec(double[] x, double[] y) {
		double[] z = new double[x.length];
		for (int i = 0; i < z.length; i++) {
			z[i] = x[i] + y[i];
		}
		return z;

	}

	public static double[] subVec(double[] x, double[] y) {
		double[] z = new double[x.length];
		for (int i = 0; i < z.length; i++) {
			z[i] = x[i] - y[i];
		}
		return z;

	}

	public static double innProd(double[] x, double[] y) {
		double[] z = new double[x.length];
		double a = 0;
		for (int i = 0; i < z.length; i++) {
			z[i] = x[i] * y[i];
			a = a + z[i];
		}
		return a;
	}

	public static double[] matVec(double[][] A, double[] x) {
		double[] y = new double[x.length];
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				y[i] = y[i] + A[i][j] * x[j];
			}
		}
		return y;
	}

	public static double[] residual(double[][] A, double[] x, double[] b) {
		double[] z = new double[x.length];
		double[] y = new double[x.length];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				y[i] = y[i] + A[i][j] * x[j];
			}
			z[i] = y[i] - b[i];
		}
		return z;
	}

	public static double[][] addMat(double[][] A, double[][] B) {
		double[][] C = new double[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}

	public static double[][] multipleMat(double[][] A, double[][] B) {
		double[][] C = new double[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				C[i][j] = A[i][j] * B[i][j];
			}
		}
		return C;
	}

	public static double vecNorm(double[] x) {
		double norm = 0;
		for (int i = 0; i < x.length; i++) {
			norm += Math.pow(x[i], 2);
		}
		return Math.sqrt(norm);
	}

	public static double vecNorm1(double[] x) {
		double norm = 0;
		for (int i = 0; i < x.length; i++) {
			norm = norm + Math.abs(x[i]);
		}
		return norm;
	}

	public static double vecNorm2(double[] x) {
		double norm = 0;
		for (int i = 0; i < x.length; i++) {
			norm = norm + Math.pow(Math.abs(x[i]), 2);
		}
		return Math.sqrt(norm);
	}

	public static double vecNormInf(double[] x) {
		double norm = 0;
		for (int i = 0; i < x.length; i++) {
			if (Math.abs(x[i]) > norm) {
				norm = Math.abs(x[i]);
			}
		}
		return norm;
	}

	public static double matNorm1(double[][] A) {
		double norm = 0;
		for (int i = 0; i < A.length; i++) {
			double sum = 0;
			for (int j = 0; j < A[i].length; j++) {
				sum = sum + Math.abs(A[j][i]);

			}
			if (sum > norm)
				norm = sum;
		}
		return norm;
	}

	public static double matNormInf(double[][] A) {
		double norm = 0;
		for (int i = 0; i < A.length; i++) {
			double sum = 0;
			for (int j = 0; j < A[i].length; j++) {
				sum = sum + Math.abs(A[i][j]);
				if (sum > norm)
					norm = sum;
			}
		}
		return norm;
	}

}

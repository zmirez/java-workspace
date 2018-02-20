package LU;

public class Problem1 {

	public static void main(String[] args) {
		int n = 7;
		double a = 0;
		double[][] A = { { 2.0, -1.0, 0, 0, 0, 0, 0 }, { -1.0, 2.0, -1.0, 0, 0, 0, 0 }, { 0, -1.0, 2.0, -1.0, 0, 0, 0 },
				{ 0, 0, -1.0, 2.0, -1.0, 0, 0 }, { 0, 0, 0, -1.0, 2.0, -1.0, 0 }, { 0, 0, 0, 0, -1.0, 2.0, -1.0 },
				{ 0, 0, 0, 0, 0, -1.0, 2.0 } };
		double[] b = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 };
		double[] y = new double[A.length];
		double[] x = new double[A.length];
		for (int k = 0; k < n - 1; k++) {
			for (int i = k + 1; i < n; i++) {
				A[i][k] = A[i][k] / A[k][k];
				for (int j = k + 1; j < n; j++) {
					A[i][j] = A[i][j] - A[i][k] * A[k][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.3e", A[i][j]);

			}
			System.out.println();
		}
		double detA = 1;
		for (int i = 0; i < n; i++) {
			detA *= A[i][i];
		}
		System.out.println(detA);
		for (int k = 0; k < n; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += A[k][j] * y[j];
			}
			y[k] = b[k] - sum;
		}
		for (int k = n - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < n; j++) {
				sum += A[k][j] * x[j];
			}
			x[k] = (1 / A[k][k]) * (y[k] - sum);

		}
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("%.3e", x[i]);
		}

	}

}

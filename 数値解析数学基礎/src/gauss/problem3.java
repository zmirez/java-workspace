package gauss;

public class problem3 {

	public static void main(String[] args) {
		int n = 5;
		double A[][] = new double[n][n];
		double x[] = new double[n];
		double b[] = new double[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = 1.0 / (i + j + 1.0);
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < A.length; j++) {
				b[i] += A[i][j];
			}
			// System.out.println(b[i]);
		}
		b[0] = b[0] + 0.001 * b[0];
		for (int k = 0; k < n; k++) {
			for (int i = k + 1; i < n; i++) {
				double a = (A[i][k]) / (A[k][k]);
				b[i] = b[i] - a * b[k];
				for (int j = k; j < n; j++) {
					A[i][j] = A[i][j] - a * A[k][j];
				}
			}
		}

		for (int k = n; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < n + 1; j++) {
				sum = sum + A[k - 1][j - 1] * x[j - 1];
			}
			x[k - 1] = (1 / A[k - 1][k - 1]) * (b[k - 1] - sum);
		}

		for (int i = 0; i < n; i++) {

			System.out.printf("x=%.3e", x[i]);
			System.out.println();
		}
	}

}

package class2;

public class GaussDelete {

	public static void main(String[] args) {
		double A[][] = new double[5][5];
		double x[] = new double[5];
		double b[] = new double[5];
		for (int i = 0; i < 5; i++) {
			b[i] = 1.0;
			for (int j = 0; j < 5; j++) {
				A[i][j] = 1.0 / ((i + 1.0) + (j + 1.0));
				// b[i] += A[i][j] * x[i];
			}
			// System.out.println(b[i]);
		}
		// b[0] = b[0] * 1.001;
		for (int k = 1; k < 5; k++) {
			for (int i = k + 1; i <= 5; i++) {
				double a = (A[i - 1][k - 1]) / (A[k - 1][k - 1]);
				b[i - 1] = b[i - 1] - a * b[k - 1];
				for (int j = k; j <= 5; j++) {
					A[i - 1][j - 1] = A[i - 1][j - 1] - a * A[k - 1][j - 1];
				}
			}
		}

		for (int k = 5; k > 0; k--) {
			double sum = 0;
			for (int j = k; j < 5 + 1; j++) {
				sum = sum + A[k - 1][j - 1] * x[j - 1];
			}
			x[k - 1] = (1 / A[k - 1][k - 1]) * (b[k - 1] - sum);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%.3e ", A[i][j]);
				System.out.println();
			}
			System.out.println();
			System.out.print("b=");
			System.out.printf("%.3e ", b[i]);
			System.out.print("x=");
			System.out.printf("%.3e", x[i]);
			System.out.println();
		}
	}
}
package gauss;

public class problem2 {

	public static void main(String[] args) {
		double A[][] = new double[5][5];
		double x[] = { 1.0, 1.0, 1.0, 1.0, 1.0 };
		double b[] = new double[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = 1.0 / ((i + 1.0) + (j + 1.0));
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i] += A[i][j] * x[j];

			}
			System.out.printf("%.3e", b[i]);
		}

	}

}

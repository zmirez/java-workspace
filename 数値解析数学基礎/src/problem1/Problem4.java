package problem1;

public class Problem4 {

	public static void main(String[] args) {
		double[][] A = new double[3][3];
		double[][] B = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = i + 1 + j + 1;
				B[i][j] = Math.sqrt((i + 1) * (j + 1));
				System.out.println(A[i][j] + B[i][j]);
			}
		}
	}

}

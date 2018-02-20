package 演習課題1;

public class Problem1 {

	public static void main(String[] args) {
		double a = 1.0;
		double s = 0.0;
		int n = 0;
		System.out.println(Math.sqrt(Math.PI));
		System.out.println(Math.abs(Math.cos(3.0 / 4.0) - Math.pow(Math.E, 4)));
		System.out.println(fibo(50));
		while (a >= 1e-5) {
			n++;
			a *= (1.0 / 3);
			s += a;
		}
		System.out.printf("n=%d,s=%.6e", n, s);
		System.out.println();

		double[][] A = new double[3][3];
		double[][] B = new double[3][3];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = i + j + 2.0;
				B[i][j] = Math.sqrt((i + 1.0) * (j + 1.0));
				System.out.println(A[i][j] + B[i][j]);
			}
		}

	}

	public static long fibo(int n) {
		long[] f = new long[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n - 1];
	}

}

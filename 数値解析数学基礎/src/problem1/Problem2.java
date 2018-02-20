package problem1;

public class Problem2 {
	// フィボナッチ数列

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}

	public static long fibo(int n) {
		long[] f = new long[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i <= n - 1; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n - 1];
	}

}

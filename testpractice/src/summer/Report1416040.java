package summer;

public class Report1416040 {
	public static int n = 10000;
	public static long[] a;

	public static void main(String[] args) {
		prime(n);
		System.out.println(n + "番目の素数は" + a[n - 1]);
	}

	public static void prime(int n) {
		a = new long[n];
		a[0] = 2;
		a[1] = 3;
		for (int i = 2; i < n; i++) {
			a[i] = 0;
			for (long k = a[i - 1] + 2; a[i] == 0; k = (k + 2)) {
				for (int j = 1; j <= i && a[i] == 0; j++) {
					if (a[j] * a[j] <= k) {
						if (k % a[j] == 0)
							break;
					} else
						a[i] = k;
				}
			}
		}
	}

}

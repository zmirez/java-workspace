package tools;

public class MyMath {
	/**
	 * ランダムな整数配列をつくる n=配列の長さ
	 */
	public static int[] randomArray(int n, int min, int max) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = min + (int) (Math.random() * (max - min + 1));
		}
		return array;
	}

	/** 配列要素の入れ替え */
	public static void swap(int[] a, int i, int j) {
		int dummy = a[i];
		a[i] = a[j];
		a[j] = dummy;
	}

	/** 配列の最初のいくつかを出力 */
	public static void arrayPrint(String mess, int[] a, int n) {
		System.out.println(mess);
		for (int i = 0; i < n; i++) {
			System.out.printf("%d", a[i]);
		}
		System.out.println();
	}

	// 再帰Euclid
	public static int gcd(int a, int b) {
		System.out.printf("%dと%dのGCDを求めています%n", a, b);
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	// 非再帰
	public static int gcd2(int a, int b) {
		while (b != 0) {
			int r = b;
			b = a % b;
			a = r;
		}
		return a;
	}

	// 再帰版べき乗計算
	static long power(long x, int n) {
		if (n == 0)
			return 1L;
		if (n % 2 == 0)
			return power(x * x, n / 2);
		else
			return x * power(x, n - 1);
	}

}

package test;

public class Osk {

	public static void main(String[] args) {
		int x = 0;
		int sum = 1;
		long a0 = 1;
		long a1 = 1;
		long an = 0;
		/*
		 * for (int i = 1; i <= 100; i++) { if (i % 2 == 0) { x = x + i; } }
		 * System.out.println(x);
		 */
		for (int i = 1; i <= 13; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
		// System.out.println(fibonacci(48));
		for (int i = 1; i < 48; i++) {
			an = a0 + a1;
			a0 = a1;
			a1 = an;
		}
		System.out.println(an);

	}

	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

}

package recursive;

public class FibonacciExample {

	public static void main(String[] args) {
		int nmin = 10;
		int nmax = 50;
		int count = 1000000;
		long startTime = 0;
		long endTime = 0;
		long ans = 0;

		System.out.println("非再帰呼び出し（配列を使わない）");
		for (int n = nmin; n <= nmax; n++) {
			startTime = System.nanoTime();
			for (int i = 0; i < count; i++) {
				ans = Fibonacci.calc1(n);
			}
			endTime = System.nanoTime();
			System.out.printf("%3d,%7d,%d%n", n, ans, (endTime - startTime));
		}

		System.out.println("非再帰呼び出し（配列）");
		for (int n = nmin; n <= nmax; n++) {
			startTime = System.nanoTime();
			for (int i = 0; i < count; i++) {
				ans = Fibonacci.calc2(n);
			}
			endTime = System.nanoTime();
			System.out.printf("%3d,%7d,%d%n", n, ans, (endTime - startTime));
		}

		System.out.println("一般の再帰呼び出し");
		for (int n = nmin; n <= nmax; n++) {
			startTime = System.nanoTime();
			for (int i = 0; i < count; i++) {
				ans = Fibonacci.calc3(n);
			}
			endTime = System.nanoTime();
			System.out.printf("%3d,%7d,%d%n", n, ans, (endTime - startTime));
		}

		System.out.println("ちょっと凝った再帰呼び出し");
		for (int n = nmin; n <= nmax; n++) {
			startTime = System.nanoTime();
			for (int i = 0; i < count; i++) {
				ans = Fibonacci.calc4(n);
			}
			endTime = System.nanoTime();
			System.out.printf("%3d,%7d,%d%n", n, ans, (endTime - startTime));
		}

	}

}

class Fibonacci {
	static long calc1(int n) {
		long f1 = 1;
		long f2 = 1;
		long fn = 0;
		for (int i = 3; i <= n; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}

	static long calc2(int n) {
		long[] f = new long[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n - 1];
	}

	static long calc3(int n) {
		return fibo(n);
	}

	private static long fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	static long calc4(int n) {
		return fibo2(n, 1, 0);
	}

	private static long fibo2(int n, long a, long b) {
		if (n == 1)
			return a;
		else
			return fibo2(n - 1, a + b, a);
	}

}

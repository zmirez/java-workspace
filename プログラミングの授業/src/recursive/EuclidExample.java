package recursive;

import tools.MyMath;

public class EuclidExample {

	public static void main(String[] args) {
		int a = 24024;
		int b = 42840;
		// GCD(24024,42840)=168

		// 再帰のユークリッド
		int gcd = MyMath.gcd(a, b);
		System.out.printf("%dと%dの%dの最大公約数は%n", a, b, gcd);

	}

}

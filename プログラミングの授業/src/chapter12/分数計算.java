package chapter12;

public class 分数計算 {

	public static void main(String[] args) {
		int b = 1;
		int a = 2;
		int d = 1;
		int c = 3;

		int f = bunsi(a, b, c, d);
		int e = bunbo(a, b, c, d);
		System.out.printf("2つの分数の和は、%d/%d%n", f, e);

	}

	public static int bunsi(int a, int b, int c, int d) {
		int f = b * c + a * d;
		return f;
	}

	public static int bunbo(int a, int b, int c, int d) {
		int e = a * c;
		return e;
	}

}

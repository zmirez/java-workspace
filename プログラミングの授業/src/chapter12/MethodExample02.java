package chapter12;

public class MethodExample02 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("a=" + a + ",b=" + b);// 2つの値を入れ替えしたい
		swap(a, b);
		System.out.println("a=" + a + ",b=" + b);

		int[] c = new int[2];
		c[0] = a;
		c[1] = b;
		swap(c);
		a = c[0];
		b = c[1];
		System.out.println("a=" + a + ",b=" + b);
	}

	// 交換できない（利用価値のない）メソッド
	static void swap(int x, int y) {
		int z = x;
		x = y;
		y = z;
		return;
	}

	static void swap(int[] x) {
		int y = x[0];
		x[0] = x[1];
		x[1] = y;
		return;

	}

}

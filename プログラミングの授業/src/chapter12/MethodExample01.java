package chapter12;

public class MethodExample01 {
	int d = 0;// グローバル変数

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = add(a, b);// a,bは実変数
		System.out.println(a + "+" + b + "=" + c);

		int[] x = { 1, 2, 3, 4 };
		int e = add(x);
		System.out.println("配列xの要素の和は、" + e);
	}

	static int add(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	static int add(int x, int y) {// x,yは仮変数
		int z = x + y;// zはローカル変数
		return z;
	}

}

package recursive;

public class HanoiExample {

	public static void main(String[] args) {
		int n = 3;
		hanoi(n, 'A', 'B', 'C');

	}

	static void hanoi(int n, char a, char b, char c) {
		if (n == 0)
			return;
		hanoi(n - 1, a, c, b);
		System.out.printf("円盤%dを%sから%sへ移動！%n", n, a, b);
		hanoi(n - 1, c, b, a);
	}

	// T(n)に対応
	static void hanoi2(int n, char a, char b, char c) {
		if (n == 0)
			return;
		hanoi3(n - 1, a, c, b);
		System.out.printf("円盤%dを%sから%sへ移動！%n", n, a, b);
		hanoi3(n - 1, c, b, a);
	}

	// S(n)に対応
	static void hanoi3(int n, char a, char b, char c) {
		if (n == 0)
			return;
		hanoi3(n - 1, a, c, b);
		System.out.printf("円盤%dを%sから%sへ移動！%n", n, a, b);
		hanoi2(n - 1, c, a, b);
		System.out.printf("円盤%dを%sから%sへ移動！%n", n, b, c);
		hanoi3(n - 1, a, c, b);
	}

}

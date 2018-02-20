package exception;

public class ExceptionExample02 {

	public static void main(String[] args) {
		methodcall();

	}

	static void methodcall() {
		try {
			recall();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えている");
		}
	}

	static void recall() throws ArrayIndexOutOfBoundsException {
		int[] a = { 1, 2, 3 };
		a[3] = 0;
		System.out.println("hello");
	}

}

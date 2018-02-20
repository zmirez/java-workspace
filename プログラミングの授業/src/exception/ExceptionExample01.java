package exception;

public class ExceptionExample01 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 2, -1, 4 };
		int x = 3;
		if (x >= 0) {
			try {
				a[5] = 3;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("配列の範囲を超えています。");
				e.printStackTrace();
			}
		}

	}

}

package exception;

public class ExceptionExample03 {

	public static void main(String[] args) {
		try {
			callMethod(-1);
		} catch (MyException e) {
			System.out.println(e.toString());
			// e.printStackTrace();
		}
	}

	static void callMethod(int x) throws MyException {
		if (x < 0) {
			throw new MyException();
		}
	}

}

class MyException extends Exception {
	public String toString() {
		return "私独自の例外が発生";
	}
}

package chapter04;

public class Ex04_04_1B {

	public static void main(String[] args) {
		double a = 11.5;
		double b = 3.0;
		double answer = a + (2 * b);
		System.out.println("答え=" + answer);

		//answerを使わずに出力する
		System.out.println("答え=" + (a + (2 * b)));
	}

}

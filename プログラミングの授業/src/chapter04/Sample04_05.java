package chapter04;

public class Sample04_05 {

	public static void main(String[] args) {
		double x = 20; //全部実数
		double y = 3;
		double a1;
		double a2;
		double a3;
		a1 = x + y - 3;
		a2 = x / y * 5;
		a3 = x / (y * 5);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		//あまりの計算
		double b = x % y;
		System.out.println(b);

	}

}

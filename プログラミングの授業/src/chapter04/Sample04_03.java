package chapter04;

public class Sample04_03 {

	public static void main(String[] args) {
		int n = (int)12345678901L;
		System.out.println("n=" + n);

		double x = 52.76;
		int m = (int)x;
		int k = (int)(x + 3.8);
		System.out.println("m=" + m);
		System.out.println("k=" + k);

		byte a =(byte) 1230; //byte変数にintリテラルを代入
		System.out.println(a);
	}

}

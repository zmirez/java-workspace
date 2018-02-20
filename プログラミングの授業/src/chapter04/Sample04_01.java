package chapter04;

public class Sample04_01 {

	public static void main(String[] args) {
		int a,b;

		//前置
		a = 10;
		b = ++a + 5;    //aを1増やした後でa + 5を計算する
		System.out.println(a);
		System.out.println(b);

		//後置
		a = 10;
		b = a++ + 5;   //a + 5を計算した後でaを1増やす
		System.out.println(a);
		System.out.println(b);
	}

}

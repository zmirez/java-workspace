package chapter04;

import java.util.Scanner;

//キーボードから1つの実数を読み込んで2乗を出力するプログラム
public class Sample04_05_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("実数xを入力して:");
		double x = scan.nextDouble();    //スキャナーから1つの整数を読み込む　数字を書いたらEnterキーをおす
		System.out.println("x * xは、" + ( x * x ) + "です。");
		scan.close();

	}

}

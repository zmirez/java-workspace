package chapter04;

import java.util.Scanner;//Scannerクラスはデフォルトでは読み込めないので

//キーボードから整数値を1つ読み込んで2乗を出力するプラグラム
public class Sample04_05_3 {

	public static void main(String[] args) {
		//キーボードからデータを入力する準備
		Scanner scan = new Scanner (System.in);
		System.out.println("整数xを入力して:");
		int x = scan.nextInt();    //スキャナーから1つの整数を読み込む　数字を書いたらEnterキーをおす
		System.out.println("x * xは、" + ( x * x ) + "です。");
		scan.close();   //スキャナーは使い終わったら、必ず閉じる！
	}

}

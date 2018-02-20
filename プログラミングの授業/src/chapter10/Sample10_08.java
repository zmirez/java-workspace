package chapter10;

import java.util.Scanner;

public class Sample10_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no = 0;
		do{
		System.out.println("いらっしゃいませ");
		System.out.println("ご注文の番号を入力してください");
		System.out.println("1:ハンバーガー,2:チーズバーガー,3:フィレオフィッシュ");
		no = scan.nextInt();

		}while(no <1 || no>3);
		if(no == 1){
			System.out.println("ハンバーガーですね。");

		}else if(no == 2){
			System.out.println("チーズバーガーですね。");
		}else if(no == 3){
			System.out.println("フィレオフィッシュですね。");
		}
		System.out.println("ポテトフライはいかがですか。");
	}
}

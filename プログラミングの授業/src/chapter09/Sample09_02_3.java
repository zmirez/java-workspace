package chapter09;

import java.util.Scanner;

public class Sample09_02_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数値を入力して（０を入れると終わり）！");
		int number = 0;
		while(true){ //無限ループ
			number = scan.nextInt();
			if(number <= 0|| number >= 100){
				break;
			}else{
				System.out.println(number + "を入力");
			}
		}
		scan.close();
		System.out.println("終了！");
	}

}

package chapter09;

import java.util.Scanner;

public class Sample09_02_2 {

	public static void main(String[] args) {
		int x = 0;
		System.out.println(x = 123);
		Scanner scan = new Scanner(System.in);
		System.out.println("数値を入力して（０を入れると終わり）！");
		int number = 0;
		while((number=scan.nextInt())> 0 && number<100){
			System.out.println(number + "を入力");
		}
		scan.close();
		System.out.println("終了！");
	}

}

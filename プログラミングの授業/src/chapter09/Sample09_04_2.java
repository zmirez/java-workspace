package chapter09;

import java.util.Scanner;

public class Sample09_04_2 {

	public static void main(String[] args) {
		int value = 0;
		int total = 0;
		System.out.println("数値を入力（０なら終了）");
		Scanner scan = new Scanner(System.in);

		while((value = scan.nextInt())!= 0){
			total += value;
		}
		scan.close();
		System.out.println("合計=" + total);
	}

}

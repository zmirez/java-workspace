package chapter09;

import java.util.Scanner;

public class Ex09_04_3 {

	public static void main(String[] args) {
		int n = 0;
		int total = 0;
		System.out.println("数値を入力して");
		Scanner scan = new Scanner(System.in);
		do{
		 n = scan.nextInt();
		 total += n;
		}while(n > 0);
		scan.close();
		System.out.println("合計＝" + total);


	}

}

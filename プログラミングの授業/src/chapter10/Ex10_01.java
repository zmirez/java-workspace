package chapter10;

import java.util.Scanner;

public class Ex10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("暦年を入力して");
		int year = scan.nextInt();
		scan.close();
		if(year % 4==0 && year %100 !=0 || year%400==0){
			System.out.println("うるう年です");

		}else{
			System.out.println("うるう年ではありません");
		}

	}

}

package chapter08;

import java.util.Scanner;

public class Sample08_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("aの値をいれて：");
		int a = scan.nextInt();
		boolean result = a>20;
		System.out.println(result);
		scan.close();
	}

}

package chapter08;

import java.util.Scanner;

public class Sample08_02 {

	public static void main(String[] args) {

		System.out.print("文字を１文字入力して：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();

		char[]chArray = str.toCharArray();
		char ch = chArray[0];

		System.out.println("ch=" + (char)ch);
		System.out.println(ch=='a');
		System.out.println(ch != 0);
		System.out.println(ch > 'a');

	}

}

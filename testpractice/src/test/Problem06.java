package test;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("距離をメートル単位の整数値で入力してください：");
		int distance = scan.nextInt();
		int fare =0;
		if(distance<=2000){
			fare=730;
		}else{
			int money=(distance - 2000)/280;
			fare=730+90+money*90;
		}
		System.out.println("距離="+distance+"mの料金は、"+fare+"円です。");
	}

}

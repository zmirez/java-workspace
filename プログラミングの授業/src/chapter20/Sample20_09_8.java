package chapter20;

import java.util.Scanner;

//Fibonacci数列
public class Sample20_09_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("nを入力して：");
		int n = scan.nextInt();

		scan.close();

		//配列を利用した解法
		long[]f = new long[n];
		f[0] = 1;
		f[1] = 1;
		for(int i = 2;i<n;i++){
			f[i] = f[i-1] + f[i-2];
		}
		System.out.println("Fibonacci数列の"+n+"項目は、"+f[n-1]);


		//配列を利用しない解法
		long f2 = 1; //f[n-2]に対応
		long f1 = 1; //f[n-1]に対応
		long f0 = 1;
		for(int i = 2;i<n;i++){
			f0 = f1 + f2;
			f2 = f1;
			f1 = f0;
		}
		System.out.println("Fibonacci数列の"+n+"項目は、"+f0);

	}

}

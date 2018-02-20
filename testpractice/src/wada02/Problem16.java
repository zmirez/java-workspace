package wada02;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("n:");
		int n = scan.nextInt();
		scan.close();

		for(int m=0;m<=n;m++){
			long prod1 = 1;
			for(int i=n-m+1;i<=n;i++){
				prod1 *= i;
			}
			long prod2 = 1;
			for(int i=1;i<=n;i++){
				prod2 *= i;
			}
			long comb =prod1/prod2;
			System.out.println("("+n+","+m+")="+ comb);
		}

	}

}

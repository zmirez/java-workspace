package wada02;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ベクトルの要素数を入力して");
		int n = scan.nextInt();
		double[] x =new double[n];
		for(int i=0;i<n;i++){
			x[i] = Math.random();
		}
		double sum =0;
		for(int i=0;i<n;i++){
			sum += x[i]*x[i];
		}
		double x1=Math.sqrt(sum);
		double[]y =new double[n];
		for(int i=0;i<n;i++){
			y[i]=x[i]/x1;
		}


		System.out.println("作成した長さ１のベクトル：");
		for(int i=0;i<n;i++){
			System.out.println("y["+i+"]="+y[i]);
		}

	}

}

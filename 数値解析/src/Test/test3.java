package Test;

import MyBLAS.Calc;

public class test3 {

	public static void main(String[] args) {
		double[] x = new double[49];
		for (int i = 0; i < x.length; i++) {
			x[i] = Math.sqrt(i + 1);

		}
		System.out.printf("%.3e", Calc.vecNorm2(x));
		double[][] A = new double[10][10];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = 1 / (1 + j + 1.0);
			}
		}
		System.out.printf("%.3e", Calc.matNorm1(A));

	}

}

package Test;

import MyBLAS.Calc;

public class problem5 {

	public static void main(String[] args) {
		double b[] = { 1.450, 1.093, 8.845e-01, 7.456e-01, 6.456e-01 };
		double db[] = { 0.001 * b[0], 0, 0, 0, 0 };
		double x1[] = {};
		double x[] = { 1.0, 1.0, 1.0, 1.0, 1.0 };
		// 一個目
		System.out.printf("%.3e", Calc.vecNormInf(db) / Calc.vecNormInf(b));
		System.out.println();
		System.out.printf("%.3e", (Calc.vecNormInf(x1) - Calc.vecNormInf(x)) / Calc.vecNormInf(x));

	}

}

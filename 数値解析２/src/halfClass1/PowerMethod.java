package halfClass1;

import MyBlass.Calc;

public class PowerMethod {
	// べき乗

	public static void main(String[] args) {
		int n = 4;
		double a = 2.0;
		double[][] T = new double[n][n];
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[0].length; j++) {
				if (i == j)
					T[i][j] = 0;
				else if ((i == 0 && j == 3) || (i == 3 && j == 0))
					T[i][j] = 0;
				else {
					T[i][j] = 1.0 / a;
				}
			}
		}
		// Calc.printMat(T);
		power(T);

	}

	public static void power(double[][] T) {
		int N = 2000;
		double eps = 1.0e-8;
		double[] x = new double[T.length];
		double[] x1 = new double[x.length];
		int count = 0;
		double ramda0 = 0;
		double ramda = 0;
		for (int i = 0; i < x.length; i++) {
			x[i] = 1.0;
		}
		while (true) {
			if (count == N) {
				System.out.println("収束しない");
				break;
			}
			// ベクトル正規化
			int l = 0;
			double y = Calc.vecNorm2(x);
			for (int i = 0; i < x.length; i++) {
				x[i] = x[i] / y;
				if (Math.abs(x[i]) > Math.abs(x[l])) {
					l = i;
				}
			}
			// べき乗の計算
			/*
			 * for (int k = 0; k < T.length; k++) { for (int m = 0; m <
			 * T[0].length; m++) { x1[k] += T[k][m] * x[m]; } }
			 */
			x1 = Calc.matVec(T, x);

			if (x[l] != 0)
				ramda = x1[l] / x[l];
			if ((Math.abs(ramda - ramda0) / Math.abs(ramda)) < eps) {
				System.out.println("絶対値最大の固有値は" + ramda);
				System.out.println("反復回数は" + count + 1);
				Calc.printVec(x1);
				break;
			}
			for (int i = 0; i < x.length; i++) {
				x[i] = x1[i];
			}
			ramda0 = ramda;
			count++;
		}

	}

}

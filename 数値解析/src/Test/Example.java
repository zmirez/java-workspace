package Test;

import MyBLAS.Calc;

//他のパッケージから使う時に必要

public class Example {

	public static void main(String[] args) {
		int N = 5;
		double[] x = new double[N];
		for (int i = 0; i < N; i++) {
			x[i] = i;
		}
		Calc.printVec(x);
	}

}

package MyBlass;

//行列クラス
public class Matrix {

	public static double[][] makeMat(int x) {
		double[][] A = new double[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				A[i][j] = Math.random();
			}
		}
		// Calc.printMat(A);
		return A;

	}

	public static double[] makeVec(int x) {
		double[] b = new double[x];
		for (int i = 0; i < x; i++) {
			b[i] = Math.random();
		}
		return b;
	}
}

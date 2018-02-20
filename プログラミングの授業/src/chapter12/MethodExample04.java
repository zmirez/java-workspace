package chapter12;

public class MethodExample04 {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };// 行の交換をしたい
		// ちょっといただけない方法！
		/*
		 * for(int j=0;j<m[0].length;j++){ int n=m[0][j]; m[0][j]=m[1][j];
		 * m[1][j] =n; }
		 */
		// こっちを使おう
		/*
		 * int[]n=m[0]; m[0]=m[1]; m[1]=n;
		 */

		// よろしくない
		swap1(m[0], m[1]);
		printMatrix(m);

		//
		swap2(m, 0, 1);
		printMatrix(m);

	}

	static void swap1(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			a[i] = b[i];
			b[i] = c;
		}
		return;
	}

	static void swap2(int[][] a, int i, int j) {
		int[] b = a[i];
		a[i] = a[j];
		a[j] = b;
		return;

	}

	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		return;
	}

}

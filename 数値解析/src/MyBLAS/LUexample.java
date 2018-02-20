package MyBLAS;

public class LUexample {

	public static void main(String[] args) {
		double a[][] = { { 2.0, -1.0, 0, 0, 0, 0, 0 }, { -1.0, 2.0, -1.0, 0, 0, 0, 0 }, { 0, -1.0, 2.0, -1.0, 0, 0, 0 },
				{ 0, 0, -1.0, 2.0, -1.0, 0, 0 }, { 0, 0, 0, -1.0, 2.0, -1.0, 0 }, { 0, 0, 0, 0, -1.0, 2.0, -1.0 },
				{ 0, 0, 0, 0, 0, -1, 2 } };
		int n = a.length;
		double b[] = { 1, 2, 3, 4, 5, 6, 7 };
		double detA = 1.0;
		double y[] = new double[n];
		/* LU分解 */
		for (int k = 0; k < n; k++) {
			for (int i = k + 1; i < n; i++) {
				double alpha = a[i][k] / a[k][k];
				for (int j = k + 1; j < n; j++) {
					a[i][j] = a[i][j] - alpha * a[k][j];
				}
				a[i][k] = alpha;
			}
		}

		/* Lの表示 */
		System.out.println("-------------------------下三角行列L---------------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(1.0 + " ");
				} else if (i < j) {
					System.out.print(0.0 + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
				if (j == n - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("---------------------------------------------------------------------");
		/* Uの表示 */
		System.out.println("-------------------------上三角行列U---------------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					System.out.print(0.0 + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
				if (j == n - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("---------------------------------------------------------------------");
		/* 行列式の値を計算 */
		for (int t = 0; t < n; t++) {
			detA *= a[t][t];
		}
		System.out.println("detA=" + detA);
		/* 前進代入過程 */
		for (int k = 0; k < n; k++) {
			double sum = 0;
			for (int j = 0; j < k; j++) {
				sum += a[k][j] * y[j];
			}
			y[k] = b[k] - sum;
			System.out.println(y[k]);
		}

		/* 後退代入過程 */
		for (int k = n - 1; k >= 0; k--) {
			double sum = 0;
			for (int j = k + 1; j < n; j++) {
				sum += a[k][j] * b[j];
			}
			b[k] = (y[k] - sum) / a[k][k];
		}
		/* 解の出力 */
		System.out.println(
				"---------------------------------------解ベクトルx------------------------------------------------");
		VecPrint(b);
	}

	static void VecPrint(double[] b) {
		int n = b.length;
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("x=");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.3e ", b[i]);
		}

		double m[][] = { { 2.0, -1.0, 0, 0, 0, 0, 0 }, { -1.0, 2.0, -1.0, 0, 0, 0, 0 }, { 0, -1.0, 2.0, -1.0, 0, 0, 0 },
				{ 0, 0, -1.0, 2.0, -1.0, 0, 0 }, { 0, 0, 0, -1.0, 2.0, -1.0, 0 }, { 0, 0, 0, 0, -1.0, 2.0, -1.0 },
				{ 0, 0, 0, 0, 0, -1, 2 } };
		System.out.println();
		System.out.println("b=");
		Calc.printVec(Calc.matVec(m, b));
	}

}

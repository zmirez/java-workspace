package matrix;

public class Matrix {
	double[][] m;

	// コンストラクタ
	Matrix(double[][] m) {
		this.m = m;
	}

	// デフォルトコンストラクタ
	Matrix() {
		super();
	}

	// インスタンスメソッドによる行列の和
	Matrix add(Matrix other) {
		double[][] r = new double[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				r[i][j] = this.m[i][j] + other.m[i][j];
			}
		}
		return new Matrix(r);
	}

	// クラスメソッドによる行列の和 ver.1
	static Matrix add(Matrix A, Matrix B) {
		double[][] r = new double[A.m.length][A.m[0].length];
		for (int i = 0; i < A.m.length; i++) {
			for (int j = 0; j < A.m[0].length; j++) {
				r[i][j] = A.m[i][j] + B.m[i][j];
			}
		}
		return new Matrix(r);
	}

	// クラスメソッドによる行列の和 ver.2
	static void add(Matrix A, Matrix B, Matrix C) {
		C.m = new double[A.m.length][A.m[0].length];
		for (int i = 0; i < A.m.length; i++) {
			for (int j = 0; j < A.m[0].length; j++) {
				C.m[i][j] = A.m[i][j] + B.m[i][j];
			}
		}
		return;
	}

	// インスタンスメソッドによる行列の積
	Matrix multiple(Matrix other) {
		double[][] r = new double[this.m.length][other.m[0].length];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[0].length; j++) {
				r[i][j] = 0;
				for (int k = 0; k < other.m.length; k++) {
					r[i][j] += this.m[i][k] * other.m[k][j];
				}
			}
		}
		return new Matrix(r);
	}

	// インスタンスメソッドによる行列の転置
	Matrix transpose() {
		double[][] r = new double[m[0].length][m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				r[i][j] = m[i][j];
			}
		}
		return new Matrix(r);
	}

	// 行列の情報の出力
	void print(String mess) {
		System.out.println(mess);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%f ", m[i][j]);
			}
			System.out.println();
		}

	}
}
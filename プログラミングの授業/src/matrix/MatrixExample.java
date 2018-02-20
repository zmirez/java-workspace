package matrix;

public class MatrixExample {

	public static void main(String[] args) {
		Matrix A = new Matrix(new double[][] { { 1.0, 2.0 }, { 2.0, -1.0 } });
		Matrix B = new Matrix(new double[][] { { 2.0, 2.0 }, { -1.0, 3.0 } });
		// インスタンスメソッドによる行列の和
		Matrix C = A.add(B);
		C.print("A+B=");

		// クラスメソッドによる行列の和
		C = Matrix.add(A, B);
		C.print("A+B=");

		// クラスメソッドによる行列に和 ver.2
		Matrix D = new Matrix();
		Matrix.add(A, B, D);
		D.print("A+B=");

		// インスタンスメソッドによる行列の積
		C = A.multiple(B);
		C.print("AB=");

		// インスタンスメソッドによる行列の転置
		C = B.transpose();
		C.print("tB=");

		// 混合計算
		C = A.add(B).transpose();
		C.print("t(A+B)=");

		// (A+B)(tA)
		C = A.add(B).multiple(A.transpose());
		C.print("(A+B)tA=");
	}

}

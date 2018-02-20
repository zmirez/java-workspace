package chapter20;

public class Sample20_09_4 {

	public static void main(String[] args) {
		//行列の転置
		int[][]A = {{1,2,3},{4,5,6},{7,8,9}};

		//転置行列を別に作る
		int[][]B = new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[0].length;j++){
				B[j][i] = A[i][j];
			}
		}

		//自分自身を転置する(正方行列の場合）
		for(int i=0;i<A.length-1;i++){
			for(int j=1;j<A[0].length;j++){
				int dummy = A[j][i];
				A[j][i]=A[i][j];
				A[i][j]=dummy;
			}
		}

		System.out.println("A=");
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[0].length;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("B=");
		for(int i=0;i<B.length;i++){
			for(int j=0;j<B[0].length;j++){
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

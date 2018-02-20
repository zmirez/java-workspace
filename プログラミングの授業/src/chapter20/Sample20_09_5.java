package chapter20;

public class Sample20_09_5 {

	public static void main(String[] args) {
		//基本行列もどき
		double[][]A={{1,2,3},{2,-1,0},{-1,3,1}};

		for(int i=1;i<A.length;i++){
			double m =A[i][0]/A[0][0];
			for(int j=0;j<A[0].length;j++){
				A[i][j] -= m*A[0][j];
			}
		}

		System.out.println("A=");
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[0].length;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

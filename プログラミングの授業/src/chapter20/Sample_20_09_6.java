package chapter20;

public class Sample_20_09_6 {

	public static void main(String[] args) {
		int[][]A={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		//0行目と1行目の交換
		/*1つめ
		for(int j= 0;j<A[0].length;j++){
			int b = A[0][j];
			A[0][j] = A[1][j];
			A[1][j] = b;
		}
		*/

		//2つめ
		int[] c = A[0];
		A[0] = A[1];
		A[1] = c;

		//０列目と１列目の交換

		for(int i = 0;i<A.length;i++){
			int b = A[i][0];
			A[i][0] = A[i][1];
			A[i][1] = b;
		}

		//出力
		System.out.println("A=");
		for(int i =0;i<A.length;i++){
			for(int j = 0;j<A[i].length;j++){
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

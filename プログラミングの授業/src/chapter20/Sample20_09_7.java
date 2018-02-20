package chapter20;

public class Sample20_09_7 {
	public static void main(String[] args) {
		int[][]A={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		//０列目と１列目の交換のもう一つの方法
		int[]col = new int [A[0].length];
		for(int j = 0;j<col.length;j++){
			col[j] = j;

		}
		int b = col[0];
		col[0] = col[1];
		col[1] = b;

		for(int i = 0;i<A.length;i++){
			for(int j = 0;j<A[i].length;j++){
				System.out.print(A[i][col[j]] + "\t");
			}
			System.out.println();
		}
	}
}

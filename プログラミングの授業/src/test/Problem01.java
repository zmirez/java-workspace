package test;

public class Problem01 {

	public static void main(String[] args) {
		int[][]A = {{3,2,-1,4},{6,0,5,7},{3,3,0,-4}};
		int[]x = new int[A.length];
		for(int i =0;i<A.length;i++){
			int sum = 0;
			for(int j =0;j<A[i].length;j++){
				x[i] += A[i][j];

			}
		}
		System.out.println("x=");
		for(int i =0;i<x.length;i++){
			System.out.println(x[i]+"\t");
		}
		System.out.println();

		int[]y = new int [A[0].length];
		for(int j =0;j<A[0].length;j++){
			y[j] = 0;
			for(int i =0;i<A.length;i++){
				y[j] += A[i][j];

			}
		}
		System.out.println("y=");
		for(int i =0;i<y.length;i++){
			System.out.println(y[i]+"\t");
		}
		System.out.println();



	}

}

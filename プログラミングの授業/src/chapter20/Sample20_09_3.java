package chapter20;

public class Sample20_09_3 {

	public static void main(String[] args) {
		/*行列とベクトルの積
		 * A =( 1  2 0   x = (1		y =
		 *      3 -1 4		  2
		 *     -2  0 1)		  3)
		 */
		int[][]A = {{1,2,0},
					{3,-1,4},
					{-2,0,1}};
		int[]x = {1,2,3};
		int[]y = new int[A.length];

		for(int i = 0;i<A.length;i++){
			y[i] = 0;
			for(int j = 0;j<A[i].length;j++){
				y[i] += A[i][j]*x[j];
			}
		}

		System.out.print("y=");
		for(int i = 0;i<y.length;i++){
			System.out.print(y[i] + "\t");
		}
		System.out.println();

		//ベクトルの積

		int[]p = {1,0,3};
		int[]q = {2,1,-3};
		int r = 0;

		for(int i = 0;i<p.length;i++){
			r += p[i]*q[i];
		}
		System.out.println("r=" + r);

		//行列の積

		int[][]M = {{1,0},{2,1},{-1,3}};
		int[][]N = {{2,-1},{-2,3}};
		int[][]O = new int [M.length][N[0].length];

		for(int i = 0;i<O.length;i++){
			for(int j = 0;j<O[0].length;j++){
				O[i][j] = 0;
				for(int k = 0;k<N.length;k++){
					O[i][j] += M[i][k]*N[k][j];
				}
			}
		}

		System.out.println("O=");
		for(int i = 0;i<O.length;i++){
			for(int j = 0;j<O[0].length;j++){
				System.out.print(O[i][j]+"\t");
			}
		System.out.println();
		}
	}

}

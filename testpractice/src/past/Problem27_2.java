package past;

public class Problem27_2 {

	public static void main(String[] args) {
		int[][]a ={{1,-2,3,4},{-3,2,-1,0}};
		int[][]b =new int[a.length][a.length];
		for(int i=0;i<a[0].length;i++){
			for(int j=0;j<a.length;j++){


			b[i][j]=a[i][j]*a[j][i];
			System.out.println(b[i][j]+"\t");
			}


		}
		System.out.println();


	}

}

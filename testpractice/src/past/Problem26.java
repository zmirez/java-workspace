package past;

public class Problem26 {

	public static void main(String[] args) {
		int[][]a={{1,-2,0,3},{-3,5,2,1},{10,7,4,0}};
		int[][]b = new int[4][3];
		for(int i=0;i<a[0].length;i++){
			for(int j=0;j<a.length;j++){

				int[]c=a[0];
				a[0]=a[2];
				a[2] =c;
				b[i][j]=a[j][i];

			}
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

package chapter20;

public class Sample20_09_2 {

	public static void main(String[] args) {
		//１次元配列
		int[]a = {1,2,3,4,5};
		int[]b = new int[5];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;

		//2次元配列
		int[][]c = {{1,2,3},{4,5}};
		int[][]d = new int [2][3];
		int[][]e = new int [2][];
		//e[0] = new int[3];
		//e[1] = new int[2];

		//e[0] = new int[]{1,2,3};
		//e[1] = new int[]{4,5};

		int[]f0 = {1,2,3};
		int[]f1 = {4,5};
		int[][]f ={f0,f1};
	}

}

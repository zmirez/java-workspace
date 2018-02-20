package chapter12;

public class MethodExample03 {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11 }, { 12, 13, 14, 15, 16, 17 } };
		averageRow(m);// 行列の各行ごとの平均値を求める
	}

	static void averageRow(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			double ave = getAverage(m[i]);// ある行の平均値を求める
			printAverage(i, ave);// 平均値を出力する
		}
		return;

	}

	static double getAverage(int[] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		double ave = (double) sum / m.length;
		return ave;
	}

	static void printAverage(int i, double ave) {
		System.out.println(i + "行目の要素の平均値は、" + ave);
		return;
	}
}

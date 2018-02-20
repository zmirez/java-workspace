package sortingexample;

import tools.MyMath;
import tools.Sorting;

public class SortingExample {

	public static void main(String[] args) {
		int n = 20;
		int max = 10000;
		int[] array = makeIntArray(n, max);
		int[] a = new int[array.length];

		System.arraycopy(array, 0, a, 0, array.length);
		Sorting.insertionSort(a);
		MyMath.arrayPrint("挿入法の結果", a, 10);

		System.arraycopy(array, 0, a, 0, array.length);
		Sorting.selectionsSort(a);
		MyMath.arrayPrint("選択法の結果", a, 10);

		System.arraycopy(array, 0, a, 0, array.length);
		Sorting.bubbleSort(a);
		MyMath.arrayPrint("泡立ち法の結果", a, 10);

	}// main fnish

	// 1以上max未満
	static int[] makeIntArray(int n, int max) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * max + 1);
		}
		return array;
	}
}

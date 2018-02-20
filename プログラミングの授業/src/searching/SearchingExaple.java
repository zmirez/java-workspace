package searching;

import tools.MyMath;
import tools.Sorting;

public class SearchingExaple {

	public static void main(String[] args) {
		int n = 100;
		int[] array = MyMath.randomArray(n, 1, 500);
		MyMath.arrayPrint("array", array, 20);
		int[] array2 = new int[array.length];
		System.arraycopy(array, 0, array2, 0, array.length);
		Sorting.selectionsSort(array2);
		MyMath.arrayPrint("array2=", array2, 20);
	}

}

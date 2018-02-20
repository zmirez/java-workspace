package tools;

public class Sorting {
	/**
	 * 選択法 入力：int[] 出力：void(入力列自身をソート） 順序：昇順 アルゴリズム：非再帰
	 */
	public static void selectionsSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = 0; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			MyMath.swap(array, i, min);
		}
	}

	/**
	 * 泡立ち法 入力：int[] 出力：void(入力自身をソート 順序：昇順 アルゴリズム：非再帰
	 */
	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i >= 1; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (array[j] < array[j + 1]) {
					MyMath.swap(array, j, j + 1);
					sorted = false;
				}
			}
			if (sorted)
				break;
		}
	}

	/**
	 * 挿入法 入力：int[] 出力：void（入力列自身をソート） 順序：昇順 アルゴリズム：非再帰
	 */
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j - 1] > array[j])
					MyMath.swap(array, j, j - 1);
			}
		}
	}

	public static void insertionSort2(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			boolean inserted = false;
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > temp) {
					array[j + 1] = array[j];
				} else {
					array[j + 1] = temp;
					inserted = true;
					break;
				}
			}
			if (!inserted)
				array[0] = temp;
		}
	}

	public static void heapSort(int[] array) {
		buildHeap(array);
		for (int i = array.length; i >= 0; i--) {
			MyMath.swap(array, 0, i);
			heapUpdate(array, 0, i);
		}
	}

	private static void buildHeap(int[] array) {
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			heapUpdate(array, i, array.length);
		}
	}

	private static void heapUpdate(int[] array, int parent, int last) {
		int left_child = 2 * parent + 1;
		int right_child = left_child + 1;
		int largest = parent;
		if (left_child < last && array[left_child] > array[largest]) {
			largest = left_child;
		}
		if (right_child < last && array[right_child] > array[largest]) {
			largest = right_child;
		}
		if (largest != parent) {
			MyMath.swap(array, parent, largest);
			heapUpdate(array, largest, last);
		}
	}

	/**
	 * クイックソート 入力：int[] 出力：void 順序：昇順 アルゴリズム：再帰
	 */

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left >= right)
			return;
		int center = array[(left + right) / 2];
		int i = left;
		int j = right;
		while (true) {
			while (true) {
				while (array[i] < center)
					i++;
				while (array[j] >= center)
					j--;
				if (i >= j)
					break;
				MyMath.swap(array, i, j);
			}
			quickSort(array, left, j - 1);
			quickSort(array, i + 1, right);
		}
	}
}

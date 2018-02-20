package evalution;

public class Student {
	String name;
	String birthday;
	int math;
	int sci;
	int eng;

	static void sortMath(Student[] students, int count) {
		// selection sort
		for (int i = 0; i < count - 1; i++) {
			int max = i;
			for (int j = i + 1; j < count; j++) {
				if (students[j].math > students[max].math)
					max = j;
			}
			Student dummy = students[i];
			students[i] = students[max];
			students[max] = dummy;
		}

	}

	static void sortMath_min(Student[] students, int count) {
		for (int i = 0; i < count - 1; i++) {
			int min = i;
			for (int j = i + 1; j < count; j++) {
				if (students[j].math < students[min].math)
					min = j;
			}
			Student dummy = students[i];
			students[i] = students[min];
			students[min] = dummy;
		}
	}

	static void print(Student[] students, int count, int top) {
		if (top > count)
			top = count;
		for (int i = 0; i < top; i++) {
			System.out.printf("%s:%d%n", students[i].name, students[i].math);
		}
	}

}

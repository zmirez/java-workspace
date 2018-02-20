package evalution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvaluationExample02 {

	public static void main(String[] args) {
		int n = 100;
		Student[] students = new Student[n];
		try {
			Scanner scan = new Scanner(new File("src/evalution/birthdays.csv"), "SJIS");
			scan.useDelimiter("\\s*,\\s*|\\r\\n");
			int count = 0;
			while (scan.hasNext()) {
				students[count] = new Student();
				students[count].name = scan.next();
				students[count].birthday = scan.next();
				students[count].math = scan.nextInt();
				students[count].sci = scan.nextInt();
				students[count].eng = scan.nextInt();
				count++;
			}
			scan.close();
			Student.sortMath_min(students, count);
			Student.print(students, count, 10);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

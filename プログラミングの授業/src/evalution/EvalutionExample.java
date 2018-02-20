package evalution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvalutionExample {

	public static void main(String[] args) {
		int n = 50;
		String[] name = new String[n];
		String[] birthday = new String[n];
		int[][] course = new int[n][3];
		try {
			Scanner scan = new Scanner(new File("src/evalution/birthdays.csv"), "SJIS");
			scan.useDelimiter("\\s*,\\s*|\\r\\n");
			int count = 0;
			while (scan.hasNext()) {
				name[count] = scan.next();
				birthday[count] = scan.next();
				course[count][1] = scan.nextInt();
				course[count][2] = scan.nextInt();
				course[count][3] = scan.nextInt();
				count++;
			}
			scan.close();
			// この時点で
			sort(count, name, birthday, course);
			//
			print10(count, name, course);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	static void sort(int count, String[] name, String[] birthday, int[][] course) {
		// selection sort
		for (int i = 0; i < count - 1; i++) {
			int max = i;
			for (int j = i + 1; j < count; j++) {
				if (course[j][0] > course[max][0])
					max = j;
			}
			String dummy = name[i];
			name[i] = name[max];
			name[max] = dummy;
			dummy = birthday[i];
			birthday[i] = birthday[max];
			birthday[max] = dummy;
			int[] c = course[i];
			course[i] = course[max];
			course[max] = c;
		}

	}

	static void print10(int count, String[] name, int[][] course) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s:%d%n", name[i], course[i][0]);
		}
	}
}

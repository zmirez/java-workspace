package wada05;

public class StudentExample {

	public static void main(String[] args) {
		// 学 生 の デ ー タ 配 列 （ 学 籍 番 号 , 氏 名 , 数 学 の 試 験 の 成 績 配 列 ）
		Student[] student = { new Student(1417001, "相原研輔", new int[] { 90, 83, 95, 88, 100, 85 }),
				new Student(1417002, "江夏洋一", new int[] { 70, 65, 100, 90 }),
				new Student(1417003, "宇内昭人", new int[] { 60, 85, 70, 80, 75 }),
				new Student(1417004, "深作亮也", new int[] { 100, 90, 55, 75 }),
				new Student(1417005, "和田雅美", new int[] { 30, 60, 80, 70 }) };
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d:%5s 数 学 の 評 価 = %s%n", student[i].sno, student[i].name, student[i].mathGrade());
		}

	}

}

class Student {
	int sno; // 学 籍 番 号
	String name; // 氏 名
	int[] math; // 数 学 の 成 績 の 配 列
	int average = 0;

	Student(int sno, String name, int[] math) {
		this.sno = sno;
		this.name = name;
		this.math = math;
	}

	/*
	 * * 数 学 の 試 験 の 平 均 点 を 求 め て 、 評 価 "S","A","B","C","D" の い ず れ か を 返 す * 平
	 * 均 が 90 以 上 → "S" * 平 均 が 80 以 上 → "A" * 平 均 が 70 以 上 → "B" * 平 均 が 60 以 上
	 * → "C" * そ れ 以 外 → "D" * 試 験 は 最 低 ４ 回 受 験 す る こ と に な っ て い て 、 そ れ よ り 多
	 * く 受 験 し て い る 場 合 、 * 点 数 の 良 い も の ４ 回 分 で 評 価 す る
	 */

	String mathGrade() {
		String grade;
		int a = 0;
		for (int i = 0; i < math.length - 1; i++) {
			for (int j = 0; j < math.length - 1 - i; j++) {
				if (math[j] < math[j + 1]) {
					int b = math[j];
					math[j] = math[j + 1];
					math[j + 1] = b;
				}

			}
		}
		for (int i = 0; i < 4; i++) {
			a += math[i];
		}
		average = a / 4;
		if (average >= 90) {
			grade = "S";
		} else if (average >= 80) {
			grade = "A";
		} else if (average >= 70) {
			grade = "B";
		} else if (average >= 60) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}
}

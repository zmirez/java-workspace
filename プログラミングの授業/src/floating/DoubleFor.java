package floating;

public class DoubleFor {

	public static void main(String[] args) {
		int count = 0;
		for (double x = 0.0; x <= 1.0; x += 0.1) {
			double c = 0.1 * count;
			System.out.printf("x=%.20f%s c=%.20f%n", x, compare(x, c), c);
			count++;
		}

	}

	static String compare(double x, double y) {
		if (x > y)
			return ">";
		else if (x < y)
			return "<";
		else
			return "=";
	}// 結果が＝にならないのは、0.1が２進数で無理数だから

}

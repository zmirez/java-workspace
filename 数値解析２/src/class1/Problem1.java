package class1;

public class Problem1 {

	public static void main(String[] args) {
		float a = 0.2f;
		float sum = 0f;
		double b = 0.2;
		double s = 0;
		for (int i = 0; i < 5000; i++) {
			sum += a;
			s += b;
		}
		System.out.println(sum);
		System.out.println(0.2f * 5000);
		System.out.println(s);
		System.out.println(0.2 * 5000);

	}

}

package テスト;

public class Problem2_1 {

	public static void main(String[] args) {
		float a = 0;
		float s = 0;
		int n = 4;
		for (int i = 1;; i++) {
			s = s + (float) (1.0 / Math.pow(i, 4));
			if (s == s + (float) (1.0 / Math.pow(i, 4))) {
				System.out.println(i);
				break;
			}
		}
		System.out.printf("%.7e", s);

	}

}

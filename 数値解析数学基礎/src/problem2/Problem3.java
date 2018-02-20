package problem2;

public class Problem3 {

	public static void main(String[] args) {
		float s = 0;
		float s1 = 0;
		float s2 = 0;
		for (float i = 1f; i <= 500; i++) {
			s = s + 1f / (i * i);
		}
		System.out.println(s);
		for (float i = 1f; i <= 5000; i++) {
			s1 += 1f / (i * i);
		}
		System.out.println(s1);
		for (float i = 1f; i <= 50000; i++) {
			s2 += 1f / (i * i);
		}
		System.out.println(s2);
		float sum = 0;
		for (float i = 1;; i++) {
			sum = sum + 1f / (i * i);
			if (sum == sum + 1f / (i * i)) {
				System.out.println(i);
				break;
			}
		}

	}

}

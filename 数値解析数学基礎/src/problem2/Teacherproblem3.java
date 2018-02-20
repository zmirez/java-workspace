package problem2;

public class Teacherproblem3 {

	public static void main(String[] args) {
		float S1 = 0.0f, S2 = 0.0f, S = 1.0f;
		// double S1 = 0.0, S2 = 0.0, S = -1.0;
		int i = 1;
		for (i = 1;; i++) {
			S = S1;
			S1 = S + (float) (1.0f / (i * i));
			// S1 = S + 1.0/(i*i);
			if (S == S1)
				break;
		}
		System.out.println("N = " + (--i) + ", S1 = " + S1);
		int N1 = 5000;
		int N2 = 50000;
		for (i = 1; i <= N1; i++) {
			S2 = S2 + (float) (1.0 / ((N1 - i + 1) * (N1 - i + 1)));
			// S2 = S2 + 1.0/((N1-i+1)*(N1-i+1));
		}
		System.out.printf("N = %d, S2 = %.16e \n", N1, S2);
		S2 = 0;
		for (i = 1; i <= N2; i++) {
			S2 = S2 + (float) (1.0 / ((N2 - i + 1) * (N2 - i + 1)));
			// S2 = S2 + 1.0/((N2-i+1)*(N2-i+1));
		}
		System.out.printf("N = %d, S2 = %.16e \n", N2, S2);

	}

}

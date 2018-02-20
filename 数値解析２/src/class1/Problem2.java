package class1;

public class Problem2 {

	public static void main(String[] args) {
		float af = 3.8f;
		float x0f = 0.6f;
		double a = 3.8;
		double x0 = 0.6;
		double[] xn = new double[50];
		float[] x = new float[50];
		x[0] = af * x0f * (1 - x0f);
		xn[0] = a * x0 * (1 - x0);
		for (int i = 1; i < 50; i++) {
			x[i] = af * x[i - 1] * (1 - x[i - 1]);
			xn[i] = a * xn[i - 1] * (1 - xn[i - 1]);
		}
		for (int i = 4; i < 30; i = i + 5) {
			System.out.println(x[i]);
			System.out.println(xn[i]);
		}

	}

}

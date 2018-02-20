package class2;

public class Newton {

	public static void main(String[] args) {// 実習課題なし
		double x0 = 3.0;
		double x = 0.0;
		for (int i = 0; i < 8; i++) {
			x = x0 - f(x0) / df(x0);
			double sum = Math.abs(x - 1.5);
			System.out.println(sum);
			x0 = x;
		}
	}

	public static double f(double x) {
		return (Math.pow(Math.E, x) - 3 * x);
	}

	public static double df(double x) {
		return (Math.pow(Math.E, x) - 3);
	}

}

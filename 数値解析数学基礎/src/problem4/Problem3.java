package problem4;

public class Problem3 {

	public static void main(String[] args) {

	}

	public static double f(double x) {
		return x * x * x + x * x - 5 * x + 3;
	}

	public static double df(double x) {
		return 3 * x * x + 2 * x - 5;
	}

}

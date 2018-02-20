package class2;

public class Newton3 {

	public static void main(String[] args) {
		// 残差のニュートン法
		double x0 = 6.0;// 初期値
		double eps = 1e-6;
		System.out.println(x0);
		for (int i = 0;; i++) {
			double x1 = 0;// 解
			x1 = x0 - (f(x0) / f1(x0));
			if (Math.abs(f(x0)) < eps) {
				System.out.println(x1);
				System.out.println(i);
				break;
			}
			x0 = x1;
		}

	}

	public static double f(double x) {
		return Math.cos(2 * x) + 2 * Math.sin(x) - (1 / (x * x));
	}

	public static double f1(double x) {
		return -2 * Math.sin(2 * x) + 2 * Math.cos(x) - 1 / (x * x);
	}

}

package class2;

public class Newton2 {

	public static void main(String[] args) {
		// 相対誤差のニュートン法
		double x0 = -6.0;// 初期値
		double eps = 1e-10;
		System.out.println(x0);
		for (int i = 0;; i++) {
			double x1 = 0;// 解
			x1 = x0 - (f(x0) / f1(x0));
			if (Math.abs((x1 - x0) / x0) < eps) {
				System.out.println(x1);
				System.out.println(i);
				break;
			}
			x0 = x1;
		}
	}

	public static double f(double x) {
		return Math.pow(Math.E, (-x / 2)) * Math.sin(x) - 5 * x;
	}

	public static double f1(double x) {
		return Math.pow(Math.E, (-x / 2)) * Math.cos(x) - (Math.pow(Math.E, (-x / 2)) * Math.sin(x)) / 2 - 5;
	}

}

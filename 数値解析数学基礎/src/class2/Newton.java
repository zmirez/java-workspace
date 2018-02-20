package class2;

public class Newton {

	public static void main(String[] args) {
		// 誤差のニュートン法
		double x0 = 2.0;// 初期値
		double eps = 1e-12;
		System.out.println(x0);
		for (int i = 0;; i++) {
			double x1 = 0;// 解
			x1 = x0 - (f(x0) / f1(x0));
			if (Math.abs(x1 - x0) < eps) {
				System.out.println(x1);
				System.out.println(i);
				break;
			}
			x0 = x1;
		}

	}

	public static double f(double x) {
		return (Math.pow(Math.E, x) - 2 * x - 1);

	}

	public static double f1(double x) {
		return (Math.pow(Math.E, x) - 2);
	}

}

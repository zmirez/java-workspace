package problem4;

public class Problem1 {

	public static void main(String[] args) {
		// ニュートン法
		int Max_iter = 50;// 上限
		int iter = 0;// 反復回数
		double x0 = -30;// 初期値
		double eps = 1e-12;
		while (Math.abs(f(x0)) >= eps) {
			x0 = x0 - (f(x0) / df(x0));
			iter++;
			System.out.println(iter + "回目" + Math.abs(x0 + 3));
			if (iter >= Max_iter) {
				System.out.println("収束できない");
				break;
			}
		}
		System.out.println(x0);
		System.out.println(iter);

	}

	public static double f(double x) {
		return x * x * x + x * x - 5 * x + 3;
	}

	public static double df(double x) {
		return 3 * x * x + 2 * x - 5;
	}

}

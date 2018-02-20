package Secant法;

public class Secant {
	public static void main(String[] args) {
		double x0 = 2.5;// 初期値
		double x1 = 3.0;// 初期値
		int M = 200;// 最大反復回数
		int N = 0;// 収束回数
		double[] X = new double[M];// 近似解を保存する配列
		double eps = 1e-12;
		for (int i = 1;; i++) {

			if (i > M) {
				System.out.println("収束しない");
				break;
			}
			// 反復式
			double x = x1 - f(x1) * ((x1 - x0) / (f(x1) - f(x0)));
			x0 = x1;
			x1 = x;
			X[i - 1] = x;
			if (Math.abs(f(x)) < eps) {
				System.out.println("収束回数は" + i);
				N = i;
				System.out.printf("%.12e", x);
				break;
			}

		}

		for (int i = 1; i < N; i++) {
			double sum = 0;
			sum = Math.abs(X[i - 1] - Math.pow(10, (1.0 / 4.0)));// 誤差
			System.out.printf("%.3e", sum);
			System.out.println();
			System.out.printf("%.3e", Math.log(sum) / (Math.log(sum) - 1));
			System.out.println();
		}

	}

	public static double f(double x) {
		return Math.pow(x, 4) - 10;
	}

	public static double af(double x) {
		return 4 * Math.pow(x, 3);
	}

}
/*
 * 反復式：x_(k+1)=x_k-f(x_k)*(x_k-x_(k-1))/{f(x_k)-f(x_(k-1))} 収束次数：p=1.6
 */

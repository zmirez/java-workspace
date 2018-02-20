package floating;

public class QuadraticEquation {

	public static void main(String[] args) {
		double a = 1;
		double b = 1.0e-13 + 1;
		double c = 1.0e-13;
		// x^2+(1+c)x+c=(x+1)(x+c)=0の根を求める
		System.out.printf("%.15fx^2+%.15fx+%.15f=0の解を求める", a, b, c);

		System.out.println("真の解:");
		System.out.println("x1=" + c);
		System.out.println("x2=" + 1.0);

		double d = b * b - 4 * a * c;

		System.out.println("単純計算の解：");
		System.out.println("x1=" + (-b + Math.sqrt(d)) / (2 * a));
		System.out.println("x2=" + (-b - Math.sqrt(d)) / (2 * a));

		System.out.println("誤差を考慮した計算の解");
		double x1 = 0;
		double x2 = 0;
		if (b > 0) {
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			x1 = c / a / x2;
		} else {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = c / a / x1;
		}
		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
	}

}

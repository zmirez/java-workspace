package chapter05;

//2次方程式の根を求める
public class Sample05_01_2 {

	public static void main(String[] args) {
		double a = 2;
		double b = -3;
		double c = 1;
		//ax^2 + bx + c = 0の根を求める
		double d = Math.sqrt(b*b-4*a*c);
		double x1 = (-b + d)/(2*a);
		double x2 = (-b - d)/(2*a);

		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
		System.out.println("Math.sqrt=" + Math.sqrt(2));

		//立方根をべき乗で表す場合
		double x = 2;
		double y = Math.pow(x, 1.0/3);//実数値のため1.0
	}

}

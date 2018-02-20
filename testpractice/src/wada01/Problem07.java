package wada01;

public class Problem07 {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 1.0;
		double theta = 30;
		double area = (1.0/2.0)*a*b*Math.sin(theta/180*Math.PI);
		System.out.println("三角形の面積は、"+area);

	}

}

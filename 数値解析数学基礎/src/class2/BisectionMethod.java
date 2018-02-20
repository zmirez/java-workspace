package class2;

public class BisectionMethod {

	public static void main(String[] args) {
		double a = -2;
		double b = 0;
		double eps = 1e-12;
		int n = 0;
		n = (int) ((Math.log(Math.abs(b - a) / eps)) / (Math.log(2)));
		System.out.println(n);
	}

}

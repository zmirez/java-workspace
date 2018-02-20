package problem2;

public class Problem2 {

	public static void main(String[] args) {
		// 桁落ちらへん
		double x = 1e-7;
		System.out.println(2 * Math.pow(Math.sin(x / 2), 2) / Math.pow(x, 2));
		System.out.println((1 - Math.cos(x)) / Math.pow(x, 2));
	}

}

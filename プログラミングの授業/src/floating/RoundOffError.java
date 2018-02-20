package floating;

public class RoundOffError {

	public static void main(String[] args) {
		int imax = 100;

		System.out.printf("Σ(1/i^5),i=1,...,%dを計算する。%n", imax);
		double sum = 0;
		for (int i = 1; i <= imax; i++) {
			sum += 1 / Math.pow(i, 5);
		}
		System.out.println("大きな数から加える:" + sum);

		sum = 0;
		for (int i = imax; i >= 1; i--) {
			sum += 1 / Math.pow(i, 5);
		}
		System.out.println("小さな数から加える:" + sum);

	}

}

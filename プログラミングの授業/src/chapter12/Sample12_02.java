package chapter12;

public class Sample12_02 {

	public static void main(String[] args) {
		System.out.println("**BMIを計算***");
		dispBMI(1.75, 70.0);
		System.out.println("***END***");

	}

	public static void dispBMI(double height, double weight) {
		double bmi = weight / Math.pow(height, 2);
		System.out.printf("BMIは%6.2fです%n", bmi);
		return;
	}

}

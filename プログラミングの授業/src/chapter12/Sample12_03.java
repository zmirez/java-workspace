package chapter12;

public class Sample12_03 {

	public static void main(String[] args) {
		System.out.println("**BMIを計算***");
		double val = getBmi(1.75, 70.0);
		System.out.println("BMIは" + val + "です");
		System.out.println("***END***");

	}

	// BMIを身長と体重から計算して返す
	public static double getBmi(double height, double weight) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}

	// BMIを出力する
	public static void dispBMI(double bmi) {
		System.out.println("BMIは" + bmi + "です");

	}

}

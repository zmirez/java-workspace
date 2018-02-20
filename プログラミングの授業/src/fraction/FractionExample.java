package fraction;

public class FractionExample {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(2, 3);
		// クラスメソッド版のadd
		Fraction f3 = Fraction.add(f1, f2);
		System.out.print("f3=");
		Fraction.print(f3);
		// インスタンスメソッド版のadd
		Fraction f4 = f1.add(f2);
		System.out.print("f4=");
		f4.print();
		Fraction f5 = f2.add(f1);

		// f1.add(f2);却下したやつ

		Fraction f6 = Fraction.mul(f1, f2);
		System.out.print("f6=");
		f6.print();

	}

}

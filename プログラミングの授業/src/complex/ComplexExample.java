package complex;

public class ComplexExample {

	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(2, 1);

		Complex c3 = Complex.add(c1, c2);
		System.out.print("c3=");
		Complex.print(c3);

		Complex c4 = c1.add(c2);
		System.out.print("c4=");
		c4.print();

		Complex c5 = Complex.sub(c1, c2);
		System.out.print("c5=");
		Complex.print(c5);

		Complex c6 = c1.sub(c2);
		System.out.print("c6=");
		c6.print();

		Complex c7 = Complex.abs(c1);
		System.out.print("c7=");
		Complex.print(c7);

		Complex c8 = c1.abs();
		System.out.print("c8=");
		Complex.print(c8);

		Complex c9 = Complex.mul(c1, c2);
		System.out.print("c9=");
		Complex.print(c9);

		Complex c10 = c1.mul(c2);
		System.out.print("c10=");
		c10.print();

		Complex c11 = Complex.div(c1, c2);
		System.out.print("c11=");
		Complex.print(c11);

		Complex c12 = c1.div(c2);
		System.out.print("c12=");
		c12.print();

	}

}

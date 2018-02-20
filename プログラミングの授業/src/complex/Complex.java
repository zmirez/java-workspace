package complex;

public class Complex {
	double real;
	double imag;

	Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	Complex() {
		this.real = 1;
		this.imag = 1;
	}

	static Complex add(Complex a, Complex b) {
		double real = a.real + b.real;
		double imag = a.imag + b.imag;
		Complex result = new Complex(real, imag);
		return result;
	}

	Complex add(Complex other) {
		double real = this.real + other.real;
		double imag = this.imag + other.imag;
		Complex result = new Complex(real, imag);
		return result;
	}

	static Complex mul(Complex a, Complex b) {
		double real = a.real * b.real + a.imag * b.imag * (-1);
		double imag = a.real * b.imag + a.imag * b.real;
		Complex result = new Complex(real, imag);
		return result;
	}

	Complex mul(Complex other) {
		double real = this.real * other.real + this.imag * other.imag * (-1);
		double imag = this.real * other.imag + this.imag * other.real;
		Complex result = new Complex(real, imag);
		return result;
	}

	static Complex sub(Complex a, Complex b) {
		double real = a.real - b.real;
		double imag = a.imag - b.imag;
		Complex result = new Complex(real, imag);
		return result;
	}

	Complex sub(Complex other) {
		double real = this.real - other.real;
		double imag = this.imag - other.imag;
		Complex result = new Complex(real, imag);
		return result;
	}

	static Complex abs(Complex a) {
		double real = Math.sqrt(a.real * a.real + a.imag * a.imag);
		double imag = 0;
		Complex result = new Complex(real, imag);
		return result;
	}

	Complex abs() {
		double real = Math.sqrt(this.real * this.real + this.imag * this.imag);
		double imag = 0;
		Complex result = new Complex(real, imag);
		return result;
	}

	static Complex div(Complex a, Complex b) {
		double real = (a.real * b.real + a.imag * b.imag) / (b.real * b.real + b.imag * b.imag);
		double imag = (a.imag * b.real - a.real * b.imag) / (b.real * b.real + b.imag * b.imag);
		Complex result = new Complex(real, imag);
		return result;
	}

	Complex div(Complex other) {
		double real = (this.real * other.real + this.imag * other.imag)
				/ (other.real * other.real + other.imag * other.imag);
		double imag = (this.imag * other.real - this.real * other.imag)
				/ (other.real * other.real + other.imag * other.imag);
		Complex result = new Complex(real, imag);
		return result;
	}

	void print() {
		if (imag == 0 && real == 0) {
			System.out.println(0);
		} else if (imag == 0) {
			System.out.println(this.real);
		} else if (real == 0) {
			System.out.println(this.imag + "i");
		} else if (imag < 0) {
			System.out.println(this.real + "" + this.imag + "i");
		} else {
			System.out.println(this.real + "+" + this.imag + "i");
		}
	}

	static void print(Complex a) {
		if (a.imag == 0 && a.real == 0) {
			System.out.println(0);
		} else if (a.imag == 0.0) {
			System.out.println(a.real);
		} else if (a.real == 0.0) {
			System.out.println(a.imag + "i");
		} else if (a.imag < 0) {
			System.out.println(a.real + "" + a.imag + "i");
		} else {
			System.out.println(a.real + "+" + a.imag + "i");
		}
	}

}

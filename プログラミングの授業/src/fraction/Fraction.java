package fraction;

/**
 * Fraction(Rational Number)class
 *
 * @author mire
 * @version 1.0
 */

public class Fraction {
	/** 分子 */
	int numer;
	/** 分母 */
	int denom;

	/** constracter */
	Fraction(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
	}

	/** default constracter */
	Fraction() {
		this.numer = 1;
		this.denom = 1;
	}

	/** 分数を出力（クラスメソッド版） */
	static void print(Fraction a) {
		System.out.println(a.numer + "/" + a.denom);
	}

	/** 分数を出力（インスタンスメソッド版） */
	void print() {
		System.out.println(this.numer + "/" + this.denom);
	}

	/** 分数の和(class method) */
	static Fraction add(Fraction a, Fraction b) {
		int numer = a.numer * b.denom + a.denom * b.numer;
		int denom = a.denom * b.denom;
		Fraction result = new Fraction(numer, denom);
		result.reducation();
		return result;
	}

	/** 分数の和(instance method) */
	Fraction add(Fraction other) {
		int numer = this.numer * other.denom + this.denom * other.numer;
		int denom = this.denom * other.denom;
		Fraction result = new Fraction(numer, denom);
		result.reducation();
		return result;
	}

	/** 分数の積分（クラスメソッド版） */
	static Fraction mul(Fraction a, Fraction b) {
		int numer = a.numer * b.numer;
		int denom = a.denom * b.denom;
		Fraction result = new Fraction(numer, denom);
		result.reducation();
		return result;
	}

	/** 分数の積分（インスタンスメソッド版） */
	Fraction mul(Fraction other) {
		int numer = this.numer * other.numer;
		int denom = this.denom * other.denom;
		Fraction result = new Fraction(numer, denom);
		result.reducation();
		return result;
	}

	/** 約分(instance method) */
	void reducation() {
		int gcd = gcd(Math.abs(numer), Math.abs(denom));
		this.numer /= gcd;
		this.denom /= gcd;
	}

	/**
	 * recursible Greatest Common Divide(class method)最大公約数
	 * Euclidの互除法を用いた再帰プログラム版
	 */
	static int gcd(int m, int n) {
		int r = m % n;
		if (r == 0)
			return n;
		else
			return gcd(n, r);
	}
}

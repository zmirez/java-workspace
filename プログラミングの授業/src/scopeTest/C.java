package scopeTest;

public class C {

	public static void main(String[] args) {
		C c = new C();
		print2();
		c.print1();

	}

	void print1() {
		System.out.println("Hello");
	}

	static void print2() {
		System.out.println("Hi!");
	}

}

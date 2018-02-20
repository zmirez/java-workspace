package scopeTest;

public class A {

	int x = 0;

	// コンストラクタ
	A(int y) {
		x = y;
	}

	public A() {
		x = 1;
	}

	public void print() {
		System.out.println("Hello");
	}

	public static void print2() {
		System.out.println("Goodby");
	}

	private void print3() {
		System.out.println("Hi!");
	}
}

class B {
	void callA() {
		A a = new A();
		// a.print3();
	}

}
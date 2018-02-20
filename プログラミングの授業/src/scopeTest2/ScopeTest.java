package scopeTest2;

import scopeTest.A;

public class ScopeTest {

	public static void main(String[] args) {
		A a = new A();
		// A a2 = new A(100);
		a.print();
		A.print2();
		// scopeTest.A a = new scopeTest();
	}

}

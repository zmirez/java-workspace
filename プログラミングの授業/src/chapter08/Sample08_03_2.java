package chapter08;

public class Sample08_03_2 {

	public static void main(String[] args) {
		String abc = "abc";
		String def = "def";
		String abcdef = "abcdef";
		System.out.println("abcdef==abc+def?" +(abcdef==abc+def));
		System.out.println("abcdef.equalds(abc+def)?"+abcdef.equals(abc+def));

		String abc2 = "abc";
		System.out.println("abc==abc?"+(abc==abc2));
		System.out.println("abc.equalds(abc)?"+abc.equals(abc2));

		 abc2 = "def";
		 System.out.println("abc=" + abc);
	}

}

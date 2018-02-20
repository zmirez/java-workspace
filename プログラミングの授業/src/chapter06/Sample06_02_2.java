package chapter06;

public class Sample06_02_2 {

	public static void main(String[] args) {
		int []dn = {21,12,45,3,56};
		dn[0] += 1;
		dn[1] -= 2;
		dn[2] *= 3;
		dn[3] /= 4;
		dn[4] %= 5;
		System.out.println(dn[0]);
		System.out.println(dn[1]);
		System.out.println(dn[2]);
		System.out.println(dn[3]);
		System.out.println(dn[4]);
	}

}

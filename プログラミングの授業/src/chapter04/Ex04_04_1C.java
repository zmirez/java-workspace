package chapter04;

public class Ex04_04_1C {

	public static void main(String[] args) {
		int gaku = 1200;
		double zei = 0.08 ;
		int komi = (int) (gaku *(1 + zei));
		System.out.println("税込で" + (komi) + "円です");

	}

}

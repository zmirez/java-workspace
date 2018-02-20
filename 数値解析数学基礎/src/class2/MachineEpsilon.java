package class2;

public class MachineEpsilon {

	public static void main(String[] args) {
		double e = 1.0; // 初期値
		while (1.0 + e - 1.0 > 0.0) {
			e = (e / 2.0);
		}
		System.out.println(2.0 * e);
		float e1 = 1.0f;
		while (1.0f + e1 - 1.0f > 0.0f) {
			e1 = e1 / 2.0f;
		}
		System.out.println(e1 * 2.0f);
	}

}

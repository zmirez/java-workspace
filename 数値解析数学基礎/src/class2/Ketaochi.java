package class2;

public class Ketaochi {

	public static void main(String[] args) {
		double x = 1.0e+20;// x=10^{20}
		System.out.println("sqrt(x+1)-sqrt(x)" + (Math.sqrt(x + 1.0) - Math.sqrt(x)));
		System.out.println(1.0 / (Math.sqrt(x + 1) + Math.sqrt(x)));

	}

}

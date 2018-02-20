package chapter06;

public class Ex06_03_2 {

	public static void main(String[] args) {
		double [] a ={1.5,2.3,0.6,3.3,9.0};
		for(int i = 0;i < a.length;i++){
		System.out.println("a["+i+"]=" + a[i]);
		}
		System.out.println();

		for(int i = 0;i < 5;i++){
			System.out.println("a["+i+"]*a["+i+"]=" + a[i]*a[i]);
		}

		System.out.println();
		for(int i= 0;i < 4;i++){
			System.out.println("a["+i+"]*a["+(i+1)+"]="+ a[i]*a[i+1]);
		}
	}

}

package chapter07;

public class Sample07_05_2 {

	public static void main(String[] args) {
		int [] data = {10,20,30,40,50,60};
		for(int i = 0;i<data.length;i++){
			int j = data.length-1-i;
			System.out.print(data[j] + "\t");
		}
	}

}

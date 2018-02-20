package chapter06;

public class Sample06_05_3 {

	public static void main(String[] args) {
		int[]degree = {80,75,100,90};
		int sum = 0;
		for(int i = 0;i<4;i++){
			sum += degree[i];
		}
		double average = (double)sum/4;
		System.out.println("平均点＝" + average);
	}

}

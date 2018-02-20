package wada01;

public class Problem11 {

	public static void main(String[] args) {
		for(int i=0;i<=360;i +=30){
			double theata =i*Math.PI/180;
			System.out.println("θ＝"+i+"°,cosθ＝"+Math.cos(theata));
		}

	}

}

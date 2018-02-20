package wada02;

public class Problem18 {

	public static void main(String[] args) {
		double[][]point ={{1.2,0.5,4.2},{3.8,2.5,0.9},
				{-3.2,5.5,1.8},{-2.0,-5.2,2.3},{5.4,2.3,1.6},
				{3.3,-3.1,0.7},{-6.1,3.2,5.0}};
		double[] gravityPoint = new double[3];
		//上記のpointの重心を求める
		for(int i=0;i<=point.length;i++){
			gravityPoint[2] += point[i][2];
		}
		for(int i=0;i<=7;i++){
			gravityPoint[i] += (point[1][2]/gravityPoint[2])*(point[1][i]-point[0][i]);
		}
		//結果の出力
		System.out.println("重心点=("+gravityPoint[0]+","+
					gravityPoint[1]+"):質量="+gravityPoint[2]);
		}


}

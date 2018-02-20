package wada02;

public class Problem17 {

	public static void main(String[] args) {
		//二つの質量の情報を２行３列の配列で与える：
		//(x1,y1):w1=(1.2,0.5):4.2 と(x2,y2):w2=(3.8,2.5):0.9
		double [][] point ={{1.2,0.5,4.2},{3.8,2.5,0.9}};

		//重心の情報を入れる２次元ベクトル：座標と質量の３情報を記憶する
		double[] gravityPoint =new double[3];

		//以下にgravityPointの値をpointの２点の情報から求める処理を書く
		gravityPoint[2] = point[0][2]+point[1][2];
		for(int i=0;i<2;i++){
			gravityPoint[i] = point[0][i]+
					(point[1][2]/gravityPoint[2])*(point[1][i]-point[0][i]);
		}
		//結果の出力
		System.out.println("重心点=("+gravityPoint[0]+","+gravityPoint[1]+"):質量="+gravityPoint[2]);
	}

}

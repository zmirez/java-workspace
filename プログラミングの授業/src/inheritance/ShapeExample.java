package inheritance;

import javax.print.attribute.standard.RequestingUserName;

public class ShapeExample {

	public static void main(String[] args) {
		Shape[] zukei = new Shape[3];
		zukei[0] = new Square(1.0, 2.0);
		zukei[1] = new Triangle(2.5, 3.0);
		zukei[2] = new Circle(2.5);
		for (int i = 0; i < zukei.length; i++) {
			zukei[i].printArea();// 面積を出力するインスタンスメソッド
		}
	}

}

// 図形の抽象クラス
abstract class Shape {
	String face;// 図形の種類

	abstract double area();// 面積を返す抽象メソッド

	void printArea() {// 面積などの情報の出力
		System.out.printf("%s%sの面積は、%f%n", face, this.toString(), area());
	}

	// 四角形のクラス
	class Square extends Shape {
		double tate;
		double yoko;

		// コンストラクタ
		Square(double tate, double yoko) {
			this.tate = tate;
			this.yoko = yoko;
			this.face = "四角形";
		}

		// 面積
		double area() {
			return tate * yoko;
		}

		public String ToString() {
			return "(縦=" + tate + ",横=" + yoko;
		}

	}

	// 三角形クラス
	class Triangle extends Shape {
		double tehen;
		double takasa;

		// コンストラクタ
		public Triangle(double tehen, double takasa) {
			this.tehen = tehen;
			this.takasa = takasa;
			this.face = "三角形";
		}
		// 面積
		return tehen+takasa/2;
	}

	// 円のクラス
	class Circle extends Shape {
		double hankei;

		// コンストラクタ
		Circle(double hankei) {
			this.hankei = hankei;
			this.face = "円";
		}

		// 面積
		double area() {
			return hankei * hankei * Math.PI;
		}

// toString()をオーバーライド
public String toString(){
		return "(半径="+hankei+")";
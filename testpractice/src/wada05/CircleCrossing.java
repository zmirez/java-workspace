package wada05;

public class CircleCrossing {

	public static void main(String[] args) {
		// 円のデータ配列（円の名前、ｘ座標、ｙ座標、半径）
		Circle[] circles = { new Circle("円１", 5.0, 1.2, 0.3), new Circle("円２", 3.2, -0.5, 2.2),
				new Circle("円３", -1.5, 8.2, 5.0), new Circle("円４", -3.2, 0.6, 2.5), new Circle("円５", 1.2, 0.3, 1.8) };
		Circle circle = new Circle("円０", 2.0, 2.0, 2.5);

		System.out.printf("%sは、%n", circle.name);
		for (int i = 0; i < circles.length; i++) {
			if (circle.isCrossing(circles[i])) {
				System.out.printf("%sと交差します。%n", circles[i].name);
			}
		}
	}

}

class Circle {
	String name;// 円の名前
	double x;// 中心のｘ座標
	double y;// 中心のｙ座標
	double r;// 半径

	Circle(String name, double x, double y, double r) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	/*
	 * 引数の円ｃと交差する（共通部分がある）とき、trueを返し、 交差しないとき、falseを返す
	 */
	boolean isCrossing(Circle c) {
		if (c.r + r >= Math.sqrt((x - c.x) * (x - c.x) + (y - c.y) * (y - c.y))) {
			return true;
		} else
			return false;
	}
}
package inheritance;

import java.awt.Color;

class PointExample {
	public static void main(String[] args) {
		Point point = new Point(10, 20);
		point.print("p");
		ColorPoint cp = new ColorPoint(20, 30, Color.yellow);
		cp.print("cp");
	}

}

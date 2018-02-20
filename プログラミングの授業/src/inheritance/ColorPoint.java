package inheritance;

import java.awt.Color;

//Subclass
class ColorPoint extends Point {
	Color color;

	ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	void print(String mess) {
		System.out.printf("%s=(%d,%d):color=%s%n", mess, getX(), getY(), color);
	}
}

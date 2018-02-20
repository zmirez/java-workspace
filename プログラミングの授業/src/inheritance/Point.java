package inheritance;

//Superclass
public class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	Point() {
		// 空
	}

	void print(String mess) {
		System.out.printf("%s=(%d,%d)%n", mess, x, y);
	}
}

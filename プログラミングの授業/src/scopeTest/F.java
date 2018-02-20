package scopeTest;

public class F {
	private int y = 0;

	public int getX() {
		return y;
	}

	public void setX(int x) {
		if (x > 100 || x < 0) {
			x = 0;
		}
		this.y += x;
	}
}

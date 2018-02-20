package scopeTest;

public class G {
	int x;
	int y;
	int z;

	public static void main(String[] args) {
		G g = new G(50);
		System.out.println("x=" + g.x + ",y=" + g.y + ",z=" + g.z);
	}

	G() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	G(int x) {
		this();
		this.x = x;
	}
}

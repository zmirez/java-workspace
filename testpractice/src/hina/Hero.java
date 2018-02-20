package hina;

public class Hero {

	String name;
	int hp;
	int mp;
	static int nameNumber;

	Hero() {
		this.name = "ヒーロ";
		this.hp = 50;
		this.mp = 10;
		nameNumber++;
	}

	Hero(int a, int b) {
		this.name = "ヒーロ";
		this.hp = a;
		this.mp = b;
		nameNumber++;
	}
}

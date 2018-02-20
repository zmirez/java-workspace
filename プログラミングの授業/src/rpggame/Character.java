package rpggame;

//登場人物クラス
public class Character {
	String name;
	int hp;
	int ap;
	int mp;
	Material[] mat;// 道具
	int countMat;// 現在持ってる道具

	Character(String name) {
		this.name = name;
		hp = 0;
		ap = 0;
		mp = 0;
		mat = new Material[10];
		countMat = 0;

	}

	void setInitialPower(int hp, int ap, int mp) {
		this.hp = hp;
		this.ap = ap;
		this.mp = mp;
	}
}

package rpggame;

//勇者クラス
public class Warrior extends Character {
	Warrior(String name) {
		super(name);
		setInitialPower(50, 30, 0);
		mat[countMat++] = new Bat("こん棒");
	}
}

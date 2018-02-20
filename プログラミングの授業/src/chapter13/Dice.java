package chapter13;

public class Dice {
	static int a;// クラス変数
	int val;// 属性

	public void play() {// 機能
		val = (int) (Math.random() * 6) + 1;
		return;
	}

}

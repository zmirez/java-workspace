package chapter13;

public class Exec {

	public static void main(String[] args) {
		Dice dice = new Dice();
		Dice dice2 = new Dice();

		dice.val = 1;
		System.out.println("目数=" + dice.val);
		dice.play();
		System.out.println("目数=" + dice.val);

		dice2.val = 2;

	}

}

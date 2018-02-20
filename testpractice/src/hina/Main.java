package hina;

public class Main {

	public static void main(String[] args) {
		System.out.println(Hero.nameNumber);
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero h3 = new Hero(10, 20);

		System.out.println(h3.name + "のHP=" + h3.hp + "のHP=" + h3.mp);
		System.out.println(Hero.nameNumber);

	}

}

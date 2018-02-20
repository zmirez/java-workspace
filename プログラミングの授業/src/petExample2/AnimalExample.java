package petExample2;

public class AnimalExample {

	public static void main(String[] args) {
		Dog pochi = new Dog("pochi");
		pochi.move();
		RescueDog kuro = new RescueDog("くろ");
		kuro.rescue();

		// Animal animal =new Animal();

	}

}

class RescueDog extends Dog implements Rescuable {
	RescueDog(String name) {
		super(name);
	}

	@Override
	public void rescue() {
		System.out.println(name + "は人を救助する");
	}

}

interface Rescuable {
	int registryNumber = 12;

	void rescue();
}

abstract class Animal {
	Animal() {
		super();
	}

	abstract void move();

	abstract int calc(int x, int y);
}

class Dog extends Animal {
	String name;

	Dog(String name) {
		this.name = name;
	}

	@Override
	void move() {
		System.out.println(name + "は走り回る");
	}

	@Override
	int calc(int a, int b) {
		return a + b;
	}

}

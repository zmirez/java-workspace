package petExample;

public class PetExample {

	public static void main(String[] args) {
		Dog pochi = new Dog("ぽち");
		pochi.call();
		pochi.sit();
		Pet kuro = new Dog("くろ");
		kuro.call();
		((Dog) kuro).sit();
		System.out.println(kuro.getClass());
		if (kuro instanceof Dog) {
			((Dog) kuro).sit();
		}
		Pet noName = new Dog("");
		noName.call();
		Bird kako = new Bird("かーこ");
		kako.call();
		Pet chiro = new Bird("ちろ");
		chiro.call();
		Pet[] pets = { new Dog("ぽち"), new Bird("かーこ") };
		int sum = 0;
		for (int i = 0; i < pets.length; i++) {
			sum += pets[i].foot;
		}

	}

}

class Pet {
	int foot;
	String name;

	Pet() {
		foot = 0;
		name = "名前なし";
	}

	void call() {
		System.out.println("無視する");
	}

}

class Dog extends Pet {
	Dog() {
		super();
	}

	Dog(String name) {
		foot = 4;
		this.name = name;
	}

	void call() {
		System.out.println(name + "は、「わん」と答える");
	}

	void sit() {
		System.out.println(name + "は、座る");
	}

}

class Bird extends Pet {
	Bird(String name) {
		foot = 2;
		this.name = name;
	}

}
package bronze;

abstract class Animal {
	void eat() {
		System.out.println("食べる");
	}

	abstract void speak();

	abstract void run();
}

class Dog extends Animal {
	void speak() {
		System.out.println("ワン");
	}
	void run(){	
	}
}

public class tyuusyou {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.speak();
	}
}
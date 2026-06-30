package bronze;

public class polimofizum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal a1 = new Dog();
		Animal a2 = new Cat();

		a1.speak();
		a2.speak();
	}

}

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("ワン");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("ニャー");
package bronze;

interface Animal {
	void speak();
}

class Dog implements Animal {
	public void speak() {
		System.out.println("ワン");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal animal = new Dog();
		animal.speak();
		
	}

}

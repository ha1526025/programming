class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
    }
}


public class pra_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student student1 = new Student();
        student1.name = "太郎";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "花子";
        student2.age = 19;

        student1.introduce();
        System.out.println();

        student2.introduce();

	}

}

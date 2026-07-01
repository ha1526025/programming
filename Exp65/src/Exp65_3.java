class Student3 {
	String name = "";
	int score = -1;
	int attendance = 0;
}

public class Exp65_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student3 student1 = new Student3();
		
		student1.name = "佐藤";
		student1.score = 90;
		student1.attendance = 16;
		
		System.out.println("名前：" + student1.name); 
        System.out.println("点数：" + student1.score); 
        System.out.println("出席回数：" + student1.attendance);
	}

}

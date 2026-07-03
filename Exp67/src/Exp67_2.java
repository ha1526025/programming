class FriendRobot2{
	int giveMoney() {
		return 500;
	}
	
	String sayHello() {
		return "こんにちは！";
	}
}


public class Exp67_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot2 robot = new FriendRobot2();
		
		String message = robot.sayHello();
		System.out.println(message);
		
	}

}

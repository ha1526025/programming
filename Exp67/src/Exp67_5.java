class FriendRobot5{
	String sayHelloTo(String personName) {
		return personName + "さん、こんにちは！";
	}
}
public class Exp67_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot5 robot = new FriendRobot5();
		
		String message1 = robot.sayHelloTo("いくむ");
		String message2 = robot.sayHelloTo("あゆむ");
		String message3 = robot.sayHelloTo("はくむ");
		
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
	}

}

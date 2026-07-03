class FriendRobot3{
	int giveMoney() {
		return 500;
	}
	
	String sayHello() {
		return "こんにちは！";
	}
}

public class Exp67_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot3 robot = new FriendRobot3();
		String message = robot.sayHello();
		
		System.out.println(message);
		
		int wallet = 0;
		
		wallet += robot.giveMoney();
		System.out.println("財布の中身：" + wallet + "円");
		
		wallet += robot.giveMoney(); 
        System.out.println("財布の中⾝：" + wallet + "円"); 
 
        wallet += robot.giveMoney(); 
        System.out.println("財布の中⾝：" + wallet + "円"); 
	}

}

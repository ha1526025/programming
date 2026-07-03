class FriendRobot7{
	String sayHelloByHour(int hour) {
		if(hour < 12) {
			return "おはようございます！";
		}else if(hour < 18) {
			return "こんにちは！";
		}else {
			return "こんばんは！";
		}
	}
	
	String sayHelloTo(String personName) {
		return personName + "さん、こんにちは！";
	}
	
	int giveMoneyTimes(int count) {
		return 500;
	}
}
public class Exp67_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot7 robot = new FriendRobot7(); 
		 
        String timeMessage = robot.sayHelloByHour(10); 
        System.out.println(timeMessage); 
 
        String nameMessage = robot.sayHelloTo("いくむ"); 
        System.out.println(nameMessage); 
 
        int wallet = 0; 
 
        wallet += robot.giveMoneyTimes(2); 
        System.out.println("財布の中⾝：" + wallet + "円"); 
 
        wallet += robot.giveMoneyTimes(4); 
        System.out.println("財布の中⾝：" + wallet + "円"); 
	}

}

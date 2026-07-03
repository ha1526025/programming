class FriendRobot6 { 
    String sayHelloByHour(int hour) {  
 if (hour < 12) { 
            return "おはようございます！"; 
 } else if (hour < 18) {  
            return "こんにちは！"; 
 } else {  
            return "こんばんは！"; 
        } 
    } 
} 
public class Exp67_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot6 robot = new FriendRobot6(); 
		 
		String morningMessage = robot.sayHelloByHour(8); 
        String afternoonMessage = robot.sayHelloByHour(14); 
        String nightMessage = robot.sayHelloByHour(20); 
 
        System.out.println(morningMessage); 
        System.out.println(afternoonMessage); 
        System.out.println(nightMessage); 
	}

}

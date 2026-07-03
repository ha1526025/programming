class FriendRobot2{
	void workPartTime(int hours) { 
   	 int hourlyWage = 1000; 
   	        int money = hourlyWage * hours;  
   	 
   	        System.out.println(money + "円稼いできました、どうぞ！"); 
   	    }
}
public class Exp68_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot2 robot = new FriendRobot2();
		robot.workPartTime(3);
	}

}

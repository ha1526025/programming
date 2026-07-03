class FriendRobot1{
	
	 void sayHello() { 
	        System.out.println("こんにちは！"); 
	    }
	 String name = "ロボ太"; 
	    int battery = 100; 
	 
	    void showStatus() { 
	        System.out.println("名前：" + name); 
	        System.out.println("バッテリー：" + battery + "%"); 
	    }
	    
}

public class Exp68_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot1 robot = new FriendRobot1(); 
		 
        robot.sayHello();
        robot.showStatus();
        
	}

}

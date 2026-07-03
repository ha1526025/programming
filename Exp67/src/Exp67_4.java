class FriendRobot4 {
	int giveMoneyTimes(int count) {
		return 500 * count;
	}
}

public class Exp67_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FriendRobot4 robot = new FriendRobot4();

		int wallet = 0;

		wallet += robot.giveMoneyTimes(1);
		System.out.println("財布の中身：" + wallet + "円");

		wallet += robot.giveMoneyTimes(3);
		System.out.println("財布の中身：" + wallet + "円");

		wallet += robot.giveMoneyTimes(5);
		System.out.println("財布の中身：" + wallet + "円");
	}

}

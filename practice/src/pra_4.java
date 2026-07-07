
public class pra_4 {

	public static void main(String[] args) {
		int player = 0; // 0:グー 1:チョキ 2:パー
		int computer = (int) (Math.random() * 3);

		String[] hand = { "グー", "チョキ", "パー" };

		System.out.println("あなた: " + hand[player]);
		System.out.println("コンピュータ: " + hand[computer]);

		if (player == computer) {
			System.out.println("あいこ");
		} else if ((player + 1) % 3 == computer) {
			System.out.println("あなたの勝ち");
		} else {
			System.out.println("あなたの負け");
		}
	}
}

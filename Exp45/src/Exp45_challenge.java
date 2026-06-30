import java.util.Random;

public class Exp45_challenge{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("商品検品を開始します");

		Random rand = new Random();

		for (int item = 1; item <= 10; item++) {
			System.out.println(item + "個目の商品を検品します");
			int score = rand.nextInt(100) + 1;
			System.out.println("品質スコア：" + score);
			if (score < 70) {
				System.out.println("検品結果：不良品を検出しました");
				System.out.println("検品ラインを停止します");
				break;
			} else {
				System.out.println("検品結果：合格です");
			}
		}
		System.out.println("商品検品を終了します");

	}

}

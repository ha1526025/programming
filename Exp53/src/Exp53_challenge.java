import java.util.Random;

public class Exp53_challenge {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[][] members = {
				{ "伊藤", "鈴木", "高橋", "田中" },
				{ "伊藤", "山本", "渡辺", "中村" },
				{ "小林", "加藤", "吉田", "山田" }
		};
		Random rand = new Random();
		int num1 = rand.nextInt(3);
		int num2 = rand.nextInt(4);
		
		System.out.println("じゃあ、この問題の答えはなんですか？");
		System.out.println("前から"+num1+"番目、"+"左から"+num2+"番目の"
							+members[num1][num2]+"さん、回答してください");

	}
}

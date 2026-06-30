
public class Exp52_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = { 40, 70, 30, 60, 20 };

		//配列の最⼩値がどの要素の添字にいるかを記録する 
		int minIndex = 0;

		//すべての要素のなかから最⼩値を検索 
		for (int j = 1; j < scores.length; j++) {
			if (scores[j] < scores[minIndex]) {
				minIndex = j;
			}
		}
		System.out.println(scores[minIndex]);
	}
}

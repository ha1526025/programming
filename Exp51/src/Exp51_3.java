
public class Exp51_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = { 70, 40, 90, 60, 80 };

		System.out.println("ーーー処理前ーーー");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1-i; j++) {
				if (scores[j] > scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}

		System.out.println("ーーーソート完了後ーーー");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();

	}

}

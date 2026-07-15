
public class pra_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {78, 92, 65, 88, 54};

		int max = scores[0];
		int min = scores[0];

		for (int i = 1; i < scores.length; i++) {
		    if (scores[i] > max) {
		        max = scores[i];
		    }

		    if (scores[i] < min) {
		        min = scores[i];
		    }
		}

		System.out.println("最高点: " + max);
		System.out.println("最低点: " + min);
	}

}

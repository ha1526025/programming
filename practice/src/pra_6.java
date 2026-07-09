
public class pra_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {72, 85, 91, 68, 77};

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
		    sum += scores[i];
		}

		double average = (double) sum / scores.length;

		System.out.println("合計: " + sum);
		System.out.println("平均: " + average);
	}

}

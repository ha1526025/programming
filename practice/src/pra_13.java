import java.util.Scanner;
public class pra_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.print("5人分の点数を入力してください。");

		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
		    System.out.print((i + 1) + "人目: ");
		    score[i] = scanner.nextInt();
		}

		int pass = 0;

		for (int i = 0; i < score.length; i++) {
		    if (score[i] >= 60) {
		        pass++;
		    }
		}

		System.out.println("合格者は" + pass + "人です。");

		scanner.close();
	}

}

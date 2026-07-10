import java.util.Random;
import java.util.Scanner;

public class SuperJankenGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("じゃんけんゲームを開始します");
		System.out.println();
		System.out.println("難易度を選んでください");
		System.out.println("1：めちゃよわい");
		System.out.println("2：ふつう");
		System.out.println("3：めちゃつよい");
		Scanner sc = new Scanner(System.in);
		System.out.print("番号を入力：");
		int num = sc.nextInt();
		System.out.println();
		Random rand = new Random();
		int cpu = rand.nextInt(3);

		if (num == 1) {
			if (cpu == 0) {
				System.out.println("CPUの手：グー");
			}
			if (cpu == 1) {
				System.out.println("CPUの手：チョキ");
			}
			if (cpu == 2) {
				System.out.println("CPUの手：パー");
			}

			System.out.println("じゃんけんの手を選んでください");
			System.out.println("0：グー");
			System.out.println("1：チョキ");
			System.out.println("2：パー");
			System.out.print("番号を入力：");
			int p1 = sc.nextInt();
			if (p1 == 0) {
				System.out.println("あなたの手：グー");
			}
			if (p1 == 1) {
				System.out.println("あなたの手：チョキ");
			}
			if (p1 == 2) {
				System.out.println("あなたの手：パー");
			}

			if (cpu == 0) {
				System.out.println("CPUの手：グー");
			}
			if (cpu == 1) {
				System.out.println("CPUの手：チョキ");
			}
			if (cpu == 2) {
				System.out.println("CPUの手：パー");
			}

			if (p1 == 0) {
				if (cpu == 0) {
					System.out.println("あいこです");
				} else if (cpu == 0) {
					System.out.println("あなたの負けです");
				} else {
					System.out.println("あなたの勝ちです");
				}
			}
			if (p1 == 1) {
				if (cpu == 1) {
					System.out.println("あいこです");
				} else if (cpu == 1) {
					System.out.println("あなたの負けです");
				} else {
					System.out.println("あなたの勝ちです");
				}
			}
			if (p1 == 2) {
				if (cpu == 2) {
					System.out.println("あいこです");
				} else if (cpu == 2) {
					System.out.println("あなたの負けです");
				} else {
					System.out.println("あなたの勝ちです");
				}
			}
		} else if (num == 2) {
			boolean find = true;
			while(find == true) {
				System.out.println("じゃんけんの手を選んでください");
				System.out.println("0：グー");
				System.out.println("1：チョキ");
				System.out.println("2：パー");
				System.out.print("番号を入力：");
				int p2 = sc.nextInt();

				if (p2 == 0) {
					System.out.println("あなたの手：グー");
				}
				if (p2 == 1) {
					System.out.println("あなたの手：チョキ");
				}
				if (p2 == 2) {
					System.out.println("あなたの手：パー");
				}

				if (cpu == 0) {
					System.out.println("CPUの手：グー");
				}
				if (cpu == 1) {
					System.out.println("CPUの手：チョキ");
				}
				if (cpu == 2) {
					System.out.println("CPUの手：パー");
				}

				if (p2 == 0) {
					if (cpu == 0) {
						System.out.println("あいこです");
						System.out.println();
						System.out.println("もう一度じゃんけんします");
						System.out.println();
						find = true;
					} else if (cpu == 0) {
						System.out.println("あなたの負けです");
						System.out.println("ゲーム終了します");
						break;
					} else {
						System.out.println("あなたの勝ちです");
						System.out.println("ゲーム終了します");
						break;
					}
				}
				if (p2 == 1) {
					if (cpu == 1) {
						System.out.println("あいこです");
						System.out.println();
						System.out.println("もう一度じゃんけんします");
						find = true;
					} else if (cpu == 1) {
						System.out.println("あなたの負けです");
						System.out.println("ゲーム終了します");
						break;
					} else {
						System.out.println("あなたの勝ちです");
						System.out.println("ゲーム終了します");
						break;
					}
				}
				if (p2 == 2) {
					if (cpu == 2) {
						System.out.println("あいこです");
						System.out.println();
						System.out.println("もう一度じゃんけんします");
						find = true;
					} else if (cpu == 2) {
						System.out.println("あなたの負けです");
						System.out.println("ゲーム終了します");
						break;
					} else {
						System.out.println("あなたの勝ちです");
						System.out.println("ゲーム終了します");
						break;
					}
				}
			}
		} else {
			System.out.println("じゃんけんの手を選んでください");
			System.out.println("0：グー");
			System.out.println("1：チョキ");
			System.out.println("2：パー");
			System.out.print("番号を入力：");
			int p3 = sc.nextInt();

			if (p3 == 0) {
				System.out.println("あなたの手：グー");
			}
			if (p3 == 1) {
				System.out.println("あなたの手：チョキ");
			}
			if (p3 == 2) {
				System.out.println("あなたの手：パー");
			}

			if (p3 == 0) {
				System.out.println("CPUの手：パー");
			}
			if (p3 == 1) {
				System.out.println("CPUの手：グー");
			}
			if (p3 == 2) {
				System.out.println("CPUの手：チョキ");
			}
			System.out.println("CPUの勝ちです");
			System.out.println("ゲームを終了します");
		}
		sc.close();

	}
}
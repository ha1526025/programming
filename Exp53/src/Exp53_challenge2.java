import java.util.Scanner;

public class Exp53_challenge2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("現在のマス");
		String[][] cell = {
				{ "・", "・", "・" },
				{ "・", "・", "・" },
				{ "・", "・", "・" },
		};
		System.out.println(cell[0][0] + cell[0][1] + cell[0][2]);
		System.out.println(cell[1][0] + cell[1][1] + cell[1][2]);
		System.out.println(cell[2][0] + cell[2][1] + cell[2][2]);
		System.out.println();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			System.out.println("プレイヤー１の入力です");

			System.out.print("行番号を入力してください：");
			int row1 = sc.nextInt() - 1;
			System.out.print("列番号を入力してください：");
			int col1 = sc.nextInt() - 1;
			if (cell[row1][col1].equals("×")) {
				System.out.println("そのマスはすでに選ばれています");
				continue;

			}
			cell[row1][col1] = "〇";

			System.out.println("現在のマス");
			System.out.println(cell[0][0] + cell[0][1] + cell[0][2]);
			System.out.println(cell[1][0] + cell[1][1] + cell[1][2]);
			System.out.println(cell[2][0] + cell[2][1] + cell[2][2]);
			System.out.println();

			System.out.println("プレイヤー２の入力です");
			System.out.print("行番号を入力してください：");
			int row2 = sc.nextInt() - 1;
			System.out.print("列番号を入力してください：");
			int col2 = sc.nextInt() - 1;

			if (cell[row2][col2].equals("〇")) {
				System.out.println("そのマスはすでに選ばれています");
				continue;
			}
			cell[row2][col2] = "×";
			System.out.println("現在のマス");
			System.out.println(cell[0][0] + cell[0][1] + cell[0][2]);
			System.out.println(cell[1][0] + cell[1][1] + cell[1][2]);
			System.out.println(cell[2][0] + cell[2][1] + cell[2][2]);

		}
		sc.close();
	}
}

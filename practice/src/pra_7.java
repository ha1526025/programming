import java.util.Scanner;
public class pra_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.print("整数を入力してください: ");
		int num = scanner.nextInt();

		int factorial = 1;

		for (int i = 1; i <= num; i++) {
		    factorial *= i;
		}

		System.out.println(num + "の階乗は" + factorial + "です");

		scanner.close();
	}

}

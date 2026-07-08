import java.util.Scanner;

public class pra_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("文字列を入力してください: ");
		String text = scanner.nextLine();

		System.out.print("逆順: ");
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

		System.out.println();
		scanner.close();
	}
}

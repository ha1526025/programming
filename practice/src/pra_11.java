import java.util.Scanner;
public class pra_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.print("文字を入力してください: ");
		String text = scanner.nextLine();

		int vowelCount = 0;

		for (int i = 0; i < text.length(); i++) {
		    char ch = Character.toLowerCase(text.charAt(i));

		    if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
		        vowelCount++;
		    }
		}

		System.out.println("母音の数: " + vowelCount);

		scanner.close();
	}

}

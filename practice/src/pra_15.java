import java.util.Scanner;
public class pra_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.print("文字列を入力してください: ");
		String text = scanner.nextLine();

		int upperCount = 0;
		int lowerCount = 0;

		for (int i = 0; i < text.length(); i++) {
		    char ch = text.charAt(i);

		    if (Character.isUpperCase(ch)) {
		        upperCount++;
		    } else if (Character.isLowerCase(ch)) {
		        lowerCount++;
		    }
		}

		System.out.println("大文字の数: " + upperCount);
		System.out.println("小文字の数: " + lowerCount);

		scanner.close();
	}

}

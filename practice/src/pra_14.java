import java.util.Scanner;
public class pra_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.print("整数を入力してください: ");
		int num = scanner.nextInt();

		boolean isPrime = true;

		if (num <= 1) {
		    isPrime = false;
		} else {
		    for (int i = 2; i < num; i++) {
		        if (num % i == 0) {
		            isPrime = false;
		            break;
		        }
		    }
		}

		if (isPrime) {
		    System.out.println(num + "は素数です。");
		} else {
		    System.out.println(num + "は素数ではありません。");
		}

		scanner.close();
	}

}

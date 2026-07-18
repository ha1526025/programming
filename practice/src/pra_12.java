
public class pra_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = {24, 15, 8, 31, 42, 19};

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i] % 2 == 0) {
		        evenSum += numbers[i];
		    } else {
		        oddSum += numbers[i];
		    }
		}

		System.out.println("偶数の合計: " + evenSum);
		System.out.println("奇数の合計: " + oddSum);
	}

}

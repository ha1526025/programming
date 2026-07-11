
public class pra_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = {15, 8, 22, 31, 4, 17};

		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i] >= 10 && numbers[i] <= 20) {
		        System.out.println(numbers[i]);
		        count++;
		    }
		}

		System.out.println("10以上20以下の数は" + count + "個です");
	}

}

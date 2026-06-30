import java.util.Random;
public class Exp43_challenge1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random rand = new Random();
		int total = 0;
		int passCount = 0;
		int failCount = 0;
		for(int i=1; i<=30; i++) {
			int score = rand.nextInt(100);
			System.out.println(i+"人目：" +score+"点");
			total += score;
			if(score>=60) {
				passCount++;
			}else {
				failCount++;
			}
		}
		int average = total/30;
		System.out.println("成績集計結果");
		System.out.println("平均点："+average+"点");
		System.out.println("合格者数："+passCount+"人");
		System.out.println("不合格者数："+failCount+"人");
	}

}

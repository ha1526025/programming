
public class Exp58_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {85,72,90,58,76};
		int count = 0;
		
		for(int num: scores) {
			if(num >= 80) {
			System.out.println("点数："+num);
			count++;
			}
		}
		System.out.println("８０点以上の人数："+count+"人");
	}

}

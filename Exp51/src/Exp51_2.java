
public class Exp51_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {90,60,40};
		System.out.println("ーーー並び替え前ーーー");
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);
		
		if (scores[0] > scores[1]) {
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
		}
		if (scores[1] > scores[2]) {
			int temp = scores[1];
			scores[1] = scores[2];
			scores[2] = temp;
		}
		if(scores[0] > scores[1]) {
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
		}
		
		System.out.println("ーーー並び替え語ーーー");
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);
	}

}

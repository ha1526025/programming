import java.util.Scanner;

public class Exp49_challnge2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("ゲンガーはあたらしく「まもる」をおぼえたい...");
		System.out.println("しかしわざを４つおぼえるのでせいいっぱいだ！");
		System.out.println();
		System.out.println();
		System.out.println("ーーおぼえているわざリストーー");
		String[] waza = new String[4];
		
		waza[0] = "1：うらみ";
		waza[1] = "2：さいみんじゅつ";
		waza[2] = "3：したでなめる";
		waza[3] = "4：うらみ";
		
		System.out.println(waza[0]);
		System.out.println(waza[1]);
		System.out.println(waza[2]);
		System.out.println(waza[3]);
			System.out.println("何番目のわざを忘れさせますか：");
			
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("１，２の...ポカン！");
		System.out.println("ゲンガーはあたらしく「まもる」をおぼえた！");
		System.out.println();
		System.out.println();
		
		System.out.println("ーーおぼえているわざリストーー");
		int x = num-1;
		for(int i = 0; i < waza.length; i++) {
			if(x == i) {
				waza[i] = num + "：まもる";
			}
			System.out.println(waza[i]);
		}
	
	}
}

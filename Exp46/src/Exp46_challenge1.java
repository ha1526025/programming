
public class Exp46_challenge1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int count = 0;
		for(int i = 1; i<16; i++) {
			if(i%5==0) {
				System.out.println(i+"番の設備は整備中のためスキップします");
				System.out.println();
				System.out.println();
				continue;
			}
			System.out.println(i+"番の設備を点検します");
			System.out.println("動作確認を行います");
			System.out.println("点検記録を保存します");
			System.out.println();
			System.out.println();
			count++;
		}
		System.out.println("点検完了台数：" + count + "台");
	}

}

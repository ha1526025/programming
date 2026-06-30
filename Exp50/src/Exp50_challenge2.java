import java.util.Scanner;

public class Exp50_challenge2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("ーー商品メニューーー");
		String[] names = { "あんパン", "メロンパン", "カレーパン", "クロワッサン", "食パン"
		};
		int[] price = {180,200,230,250,320};
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] +"：" +  price[i]);
		}
		
		System.out.print("商品名を入力してください：");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		System.out.print("注文数を入力してください：");
		int money = sc.nextInt();
		System.out.println();
		System.out.println();
		boolean find = false;
		
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(menu)) {
				System.out.println("商品名：" + names[i]);
				System.out.println("単価：" + price[i] + "円");
				System.out.println("会計金額：" + (price[i]*money) + "個");
				find = true;
			}
		}
		if(!find) {
			System.out.println("その商品は登録されていません");
		}
		sc.close();
	}
}
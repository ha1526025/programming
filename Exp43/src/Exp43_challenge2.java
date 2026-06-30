
public class Exp43_challenge2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("座席予約状況");
		for(char alfa = 65; alfa <= 68; alfa++) {
			for(int num = 1; num <= 6; num++) {
				System.out.print(alfa+""+num);
				if(alfa==66&&num==3) {
					System.out.print("×"+" ");
				}else if(alfa==67&&num==5) {
					System.out.print("×"+" ");
				}else {
					System.out.print("〇"+" ");
				}
			}
			System.out.println();
		}
	}

}

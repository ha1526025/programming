
public class Exp51_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 90;
		int b = 40;
		int c = 40;
		
		System.out.println("ーーー交換前ーーー");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("ーーー交換後ーーー");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}

}

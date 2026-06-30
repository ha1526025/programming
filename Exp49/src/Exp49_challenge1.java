import java.util.Random;

public class Exp49_challenge1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random rand = new Random();
		int[] color = new int[3];
		
		
		int red = rand.nextInt(100) + 1;
		int blue = rand.nextInt(100) + 1;
		int green = rand.nextInt(100) + 1;

		color[0] = red;
		color[1] = blue;
		color[2] = green;
		

		System.out.println("red配列の要素数：" + red);
		System.out.println("blue配列の要素数：" + blue);
		System.out.println("green配列の要素数：" + green);

		int max = color[0];
		
		for (int i = 1; i < color.length; i++) {
			if (max < color[i]) {
				max = color[i];
			}
		}
		System.out.println();
		System.out.println();
		if (max == color[0]) {
		System.out.println("今回の１位：red配列（要素数" + max + "）");
		}else if (max == color[1]) {
			System.out.println("今回の１位：blue配列（要素数" + max + "）");
		}else if (max == color[2]) {
			System.out.println("今回の１位：green配列（要素数" + max + "）");
		}
	}
}

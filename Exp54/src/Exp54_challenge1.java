
public class Exp54_challenge1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] scores = {
				{78,84,72},
				{66,69,81},
				{92,88,90},
				{55,64,70},
				{84,75,72}
		};
		double ave = 0;
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.print("学生" + (i+1) + "：");
			
			for(int j = 0; j < scores[i].length; j++) {
				total += scores[i][j]; 
				System.out.print("科目" + (j+1) + "　"+scores[i][j] + "点　");
				
			}
			ave = total/scores[i].length;
			System.out.print("平均　" + ave + "点");
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("科目１の平均点；");
		System.out.println("科目２の平均点；");
		System.out.println("科目３の平均点；");
	}

}

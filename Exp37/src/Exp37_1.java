
public class Exp37_1 {

	public static void main(String[] args) {
		
		int trasureCode = 3;
		int boxNumber = 1;
		boolean isHit = false;
		
		do {
			System.out.println(boxNumber + "晩の宝箱を開けます");
			
			if(boxNumber == trasureCode) {
				System.out.println("当たりです");
				isHit = true;
			}else {
				System.out.println("はずれです");
				boxNumber++;
			}
		}while (!isHit);
		
		System.out.println("宝箱探しを終了します");
	}

}

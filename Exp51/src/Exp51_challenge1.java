
public class Exp51_challenge1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char[] letters = { 
			    'm', 'K', 'y', 'D', 'a', 'X', 'j', 'R', 'b', 'P', 
			    's', 'C', 'v', 'L', 'e', 'W', 'h', 'N', 'z', 'I', 
			    'u', 'F', 'q', 'O', 't', 'B', 'k', 'Y', 'c', 'S', 
			    'g', 'H', 'w', 'A', 'p', 'V', 'n', 'E', 'r', 'M', 
			    'x', 'J', 'd', 'U', 'i', 'T', 'f', 'Z', 'l', 'G', 
			    'o', 'Q' 
			}; System.out.println("ーーー処理前ーーー");
		for(int i = 0; i < letters.length; i++) {
			
			System.out.print(letters[i] + " ");
		}
		
		for(int j = 0; j < letters.length-1; j++) {
			for(int i = 0; i < letters.length-1; i++) {
				if(letters[i] > letters[i+1]) {
					char temp = letters[i];
					letters[i] = letters[i+1];
					letters[i+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("ーーー処理後ーーー");
		for(int j = 0; j <letters.length; j++) {
			System.out.print(letters[j] + " ");
		}
	}

}

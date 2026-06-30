package bronze;

public class bunnki_roop {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 3; i++) {
			if(i % 2 == 1) {
				for(int j = 0; j < 2; j++) {
					sum +=i;
				}
			}
		}
		System.out.println(sum);
	}

}

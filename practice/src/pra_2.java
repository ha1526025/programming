
public class pra_2 {
	    public static void main(String[] args) {
	        int[] scores = {80, 75, 90, 65, 88};

	        int sum = 0;
	        for (int score : scores) {
	            sum += score;
	        }

	        double average = (double) sum / scores.length;

	        System.out.println("合計: " + sum);
	        System.out.println("平均: " + average);
	    }
	}


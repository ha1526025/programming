
public class Exp53_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 String[][] schedule = { 
		            {"Java", "―", "Java", "―", "Java"}, 
		 {"Java", "DB 概論", "Java", "―", "Java"}, 
		 {"―", "―", "―", "リテ 1", "―"}, 
		 {"―", "―", "―", "リテ 1", "―"} 
		        }; 
		 
		        System.out.println("⽉曜⽇の時間割"); 
		        System.out.println(schedule[0][0]); 
		        System.out.println(schedule[1][0]); 
		        System.out.println(schedule[2][0]); 
		        System.out.println(schedule[3][0]); 
		 
		        System.out.println(); 
		 
		        System.out.println("⽊曜⽇の時間割"); 
		        System.out.println(schedule[0][3]); 
		        System.out.println(schedule[1][3]); 
		        System.out.println(schedule[2][3]); 
		        System.out.println(schedule[3][3]); 
	}

}

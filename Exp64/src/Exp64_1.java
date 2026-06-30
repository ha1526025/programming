class pokemon{
	String name;
	String type;
	int level;
	int hp;
	
}


public class Exp64_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 pokemon pikachu = new pokemon(); 
		 
	       //ルカリオ、モクロー⽤のインスタンス⽣成 
	        pokemon lucario = new pokemon(); 
	        pokemon mokuroh = new pokemon(); 
	 
	        pikachu.name = "ピカチュウ"; 
	        pikachu.type = "でんき"; 
	        pikachu.level = 10; 
	        pikachu.hp = 35; 
	 
	       //ルカリオ、モクローインスタンスのフィールドの値を設定
	        lucario.name = "ルカリオ"; 
	        lucario.type = "かくとう"; 
	        lucario.level = 15; 
	        lucario.hp = 70; 
	 
	        mokuroh.name = "モクロー"; 
	        mokuroh.type = "くさ"; 
	        mokuroh.level = 8; 
	        mokuroh.hp = 45; 
	 
	        System.out.println("名前：" + pikachu.name); 
	        System.out.println("タイプ：" + pikachu.type); 
	        System.out.println("レベル：" + pikachu.level); 
	        System.out.println("HP：" + pikachu.hp); 
	 
	       //ルカリオ、モクローインスタンスのフィールドの値を表⽰ 
	        System.out.println();  //表⽰をみやすくする改⾏ 
	 
	        System.out.println("名前：" + lucario.name); 
	        System.out.println("タイプ：" + lucario.type); 
	        System.out.println("レベル：" + lucario.level); 
	        System.out.println("HP：" + lucario.hp); 
	 
	        System.out.println();  //表⽰をみやすくする改⾏ 
	 
	        System.out.println("名前：" + mokuroh.name); 
	        System.out.println("タイプ：" + mokuroh.type); 
	        System.out.println("レベル：" + mokuroh.level); 
	        System.out.println("HP：" + mokuroh.hp); 
	}

}

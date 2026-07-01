class Pokemon2{
	String name;
	String type;
	int level;
	int hp;
	
	void showStatus() {
		System.out.println("ーーステータスーー");
		System.out.println("名前：" + name);
		System.out.println("タイプ：" + type);
		System.out.println("レベル：" + level);
		System.out.println("HP：" + hp);
	}
	
	String getIntroduction() {
		return "私の名前は" + name + "です、タイプは" + type + "です。現在のレベルは" + level + "で、HPは" + hp + "です。今後とも何卒よろしくお願いします。"; 
	}
}
public class Exp66_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pokemon2 pikachu = new Pokemon2();
		
		pikachu.name = "ピカチュウ";
		pikachu.type = "でんき";
		pikachu.level = 10;
		pikachu.hp = 35;
		
		System.out.println(pikachu.getIntroduction());
		
		
	}

}

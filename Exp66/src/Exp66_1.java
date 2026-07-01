class Pokemon {
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
}

public class Exp66_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pokemon pikachu = new Pokemon();
		Pokemon lucario = new Pokemon();
		Pokemon mokuroh = new Pokemon();

		pikachu.name = "ピカチュウ";
		pikachu.type = "でんき";
		pikachu.level = 10;
		pikachu.hp = 35;

		lucario.name = "ルカリオ";
		lucario.type = "かくとう";
		lucario.level = 15;
		lucario.hp = 70;

		mokuroh.name = "モクロー";
		mokuroh.type = "くさ";
		mokuroh.level = 8;
		mokuroh.hp = 45;

		pikachu.showStatus();
		System.out.println();
		lucario.showStatus();
		System.out.println();
		mokuroh.showStatus();
	}

}

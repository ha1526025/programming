class Pokemon3 {
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

	void greetTrainer(String trainerName) {
		System.out.println(trainerName + "さん、" + name + "です！");
	}
}

public class Exp66_3 {
	public static void main(String[] args) {
		Pokemon3 pikachu = new Pokemon3();
		Pokemon3 lucario = new Pokemon3();
		Pokemon3 mokuroh = new Pokemon3();

		pikachu.name = "ピカチュウ";
		lucario.name = "ルカリオ";
		mokuroh.name = "モクロー";

		pikachu.greetTrainer("サトシ");
		lucario.greetTrainer("さとし");
		mokuroh.greetTrainer("SATOSHI");
	}
}

// 第10回 4. 掛け算の表（九九）（おどろき演習）
// dan は 7、i は 1〜9。先頭と末尾は？
class MultiTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "×" + i + "＝" + (j * i) + " " + "\t");
			}
			System.out.println();
		}
	}
}


public class Exp58_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[][] petKinds = {
				{"柴犬","トイプードル","チワワ"},
				{"三毛猫","ロシアンブルー","スコティッシュフォールド"},
				{"セキセイインコ","文鳥","オカメインコ"}
		};
		
		for(String[] KindGroup: petKinds) {
			for(String kindName: KindGroup) {
				System.out.print(kindName+" ");
			}
			System.out.println();
		}
	}

}

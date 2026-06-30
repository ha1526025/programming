
public class Exp57_DiscountCalculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 String itemName = args[0]; 
	        int price = Integer.parseInt(args[1]); 
	        int discountPercent = Integer.parseInt(args[2]); 
	 
	        double discountRate = discountPercent / 100.0; 
	        double discountAmount = price * discountRate; 
	 
	        //割引後価格を計算する 
	        double finalPrice = price - discountAmount; 
	 
	        System.out.println("商品名：" + itemName); 
	        System.out.println("商品の金額：" + price + "円"); 
	        System.out.println("割引率：" + discountPercent + "%"); 
	        System.out.println("割引額：" + discountAmount + "円"); 
	        System.out.println("割引後の金額：" + finalPrice + "円");
	}

}

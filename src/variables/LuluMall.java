package variables;

public class LuluMall {
	
	public int mobiles() {
		int realme=12000;
		int iphone=14000;
		int total=realme+iphone;
		return total;
	}
	
	public int appliances() {
		int fridge=15000;
		int ac=20000;
		int total=fridge+ac;
		return total;
		
	}
	
	public static void main(String[] args) {
		
		LuluMall lm=new LuluMall();
		
		int totalmobilesBill=lm.mobiles();
		
		System.out.println("MobileBill:"+totalmobilesBill);
		
		int totalappliancesBill=lm.appliances();
		
		System.out.println("appliancesBill:"+totalappliancesBill);
		
		int totalBill=totalmobilesBill+totalappliancesBill;
		
		System.out.println("TotalBill:"+totalBill);
		
	}
	

}

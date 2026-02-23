package methods;

public class MethodCalling1 {
	
	
	int total; //Declaration
	
	public int mobiles() {
		int relame=12000;
		int samsung=14000;
		total=relame+samsung;
		return total;
	}

	public int electronics() {
		int laptop=25000;
		int tv=35000;
		total=laptop+tv;
		return total;
	}
	
	
	
	public void totalBill() {
		
		int mobileBill=mobiles();
		int electronicsBill=electronics();
		int totalBill=mobileBill+electronicsBill;
		
		System.out.println(totalBill);
	}
	
	public static void main(String[] args) {
		
		MethodCalling1 mc=new MethodCalling1();
		mc.totalBill();
		
		
	}
	
}

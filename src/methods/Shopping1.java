package methods;

public class Shopping1 {
	
	public int mobiles() {
		int realme=12000;
		int iphone=13000;
		int total=realme+iphone;
		return total;
	}
	
	
	public void totalBill() {
		
		int mobliesBill=mobiles();
		System.out.println("Mobiles Bill::"+mobliesBill);
		
	}
	
	
	public static void main(String[] args) {
		
		Shopping1 sh1=new Shopping1();
		sh1.totalBill();
		
	}

}

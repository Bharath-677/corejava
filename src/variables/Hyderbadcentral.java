package variables;

public class Hyderbadcentral {
	
	int total;;   //instance variable write once use multiple methods
	
	public int mobiles() {
		int realme=12000;   // Local variable write once & use one method only
		int iphone=13000;
		total=realme+iphone;
		return total;
	}       //so in These scenario we are avoiding the Storage issues in stack memory 
            // and it  helps better Application performance 	
	
	public int appliances() {
		int fridge=15000;
		int ac=20000;
		total=fridge+ac;
		return total;
		
	}
	
	public int electronic() {
		int laptop=25000;
		int tv=30000;
		total=laptop+tv;
		return total;
	}
	
	
	public static void main(String[] args) {
		
		Hyderbadcentral hc=new Hyderbadcentral();
		
		int totalmobilebill=hc.mobiles();
		System.out.println("Mobiles Bill:"+hc.mobiles());
		
		int totalAppliancesBill=hc.appliances();
		System.out.println("Appliances Bill:"+hc.appliances());
		
		int totalelctronicBill=hc.electronic();
		System.out.println("electronic Bill:"+hc.electronic());
		
		int totalBill=totalmobilebill+totalAppliancesBill+totalelctronicBill;
		
		System.out.println("Total Bill:"+totalBill);
	}

}

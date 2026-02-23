package methods;

public class Shopping {

	int total;
	int billwithTax;
	int billwithGst;
	
	public int mobiles() {
		int realme=12000;
		int samsung=14000;
		 total=realme+samsung;
		 billwithTax=tax(total);
		billwithGst=gst(total);
		return billwithGst;
	}
	
	public int electronics() {
		int tv=12000;
		int laptop=14000;
		 total=tv+laptop;
		  billwithTax=tax(total);
		  billwithGst=gst(billwithTax);
		  
		return billwithGst;
	}
	public int clothes() {
		int shart=1000;
		int pant=1000;
		total=shart+pant;
		billwithTax=tax(total);
		billwithGst=gst(billwithTax);
		return billwithGst;
	}
	
  public int tax(int bill) {
	  int withTax=bill+1000;
	return withTax;
	    
  } 
  
  public int gst(int bill) {
	  int withgst=bill+1000;
	  return withgst;
  }
  
  
  
  public void totalbill() {
	  int mobileBill=mobiles();
	  System.out.println("mobiles Bill::"+mobileBill);
	  int electronicsBill=electronics();
	  System.out.println("electronics Bill::"+electronicsBill);
	  
	  int clothesBill=clothes();
	  System.out.println("clothes Bill::"+clothesBill);
	  
	  int finalTotalBill=mobileBill+electronicsBill;
	  System.out.println("Final Total Bill::"+finalTotalBill);
	  
	 
	    
  }
  
	public static void main(String[] args) {
		
		Shopping s1=new Shopping();
		
		s1.totalbill();
	}
}

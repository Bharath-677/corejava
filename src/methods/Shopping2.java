package methods;

public class Shopping2 {
	
	public int mobiles() {
		int realme=12000;
		int samsung=13000;
		int iphone=15000;
		int total=realme+samsung+iphone;
		int  gstBill=gst("mobiles", total);
		 int billwithGst=total+gstBill;
		return billwithGst;
	}
	
		public int Fashion() {
			int shirt=500;
			int tshirt=500;
			int pant=1000;
			int total=shirt+tshirt+pant;
			int gstBill=gst("fashion", total);
			int totalWithGst=total+gstBill;
			
			return totalWithGst;
			
		}	
			public int electronics() {
				
				int laptop=20000;
				int tv=15000;
				int total=laptop+tv;
			    int gstBill=gst("electronics", total);
			   int totalwithgst=total+gstBill; 
				return totalwithgst;
				
		}
			
		public int toys() {
			
			int cartoy=500;
			int teddybear=500;
			int traintoy=500;
			int total=cartoy+teddybear+traintoy;
			int gstBill=gst("toys", total);
			int totalwithgst=total+gstBill;
			return totalwithgst;
		}	
		
		
		
		public int gst(String catg,int bill) {
			
			int gstAmt=0;
			if(catg.equals("mobiles")) {
				 gstAmt=(bill*10)/100;
				
				
			}else if(catg.equals("electronics")) {
				 gstAmt=(bill*15)/100;
				
				
				
			}else if(catg.equals("toys")) {
				 gstAmt=(bill*20)/100;
						
				
			}else{
				 gstAmt=(bill*18)/100;
				
				
			}
			return gstAmt;
		
			
		}
		public int discount(int totalBill) {
			
			int discount=0;
			if(totalBill>5000 && totalBill<10000) {
			  discount=(totalBill*5)/100;
			
			 
			} else if(totalBill>10000 && totalBill<25000) {
			  discount=(totalBill*10)/100;
			 
				
			} else if(totalBill>25000 && totalBill<50000){
				  discount=(totalBill*30)/100;
				 
			
			} else {
			  discount=(totalBill*2)/100;
			 
			}
			 return discount;
			
		
		
}
		
		
		public void totalBill() {
			
			int totalmobilesBill=mobiles();
			System.out.println("TOtal Mobiles BIll::"+totalmobilesBill);
			
			int totalFashionBill=Fashion();
			System.out.println("Total Fashion Bill::"+totalFashionBill);
			
		int totalelectronicsBill=electronics();
		System.out.println("Total electronics Bill::"+totalelectronicsBill);
		
		int totaltoysBill=toys();
			System.out.println("Total toys Bill::"+totaltoysBill);
			
			int finalBill=totalmobilesBill+totalFashionBill+totalelectronicsBill+totaltoysBill;
			System.out.println("finalBill::"+finalBill);
			int discountwithfinalbill=discount(finalBill);
			System.out.println("discount with final bill::"+discountwithfinalbill);
			int billtotal=finalBill-discountwithfinalbill;
			System.out.println("billtotal::"+billtotal);
			
			
		}
		
		 
	
	public static void main(String[] args) {
		Shopping2 s2=new Shopping2();
		
		s2.totalBill();
		
	}

}

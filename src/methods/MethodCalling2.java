package methods;

public class MethodCalling2 {
	
	int total; 
	int gstAmount;
	int cgstAmount;
	int sgstAmount;
	int Discount;
	
	
	public int mobiles() {
		
		int realme=12000;
		int samusung=15000;
		 total=realme+samusung;
		System.out.println("Total Amount Of Mobiles::"+total);
		
		int gst=gst("mobiles",total);
		System.out.println("Total Amount of Gst::"+gst);
		
		int totalwithGst=total+gst;
		System.out.println("Total Amount of TotalwithGst::"+totalwithGst);
		
		return totalwithGst;
	}
	
	public int electronics() {
		int laptop=20000;
		int tv=15000;
		int totalBill = laptop+tv;
		System.out.println("Total Amount Of electronicsBill::"+totalBill);
		
		int gst=gst("electronics", totalBill);
		System.out.println("Total Amount of Gst::"+gst);
		
		int totalwithGst=totalBill+gst;
		
		System.out.println("Total Amount of totalWithGst::"+totalwithGst);
		
		return totalwithGst;
	}
	
	public int clothes() {
		int shart=1000;
		int pant=1000;
		int total=shart+pant;
		System.out.println("Total Amount of clothesbill::"+total);
		int gst=gst("clothes",total);
		//System.out.println("Total Amount Of gst::"+gst);
		
		
		 int totalwithGst=total+gst;
		 System.out.println("Total Amount of totalWithGst::"+totalwithGst);
		 
		return totalwithGst;
	

	}
	
	public int gst(String catg,int bill) {
		
		int gstAmount = 0;
		int sgstAmount=0;
		int cgstAmount=0;
		int Discount=0;
		
		
		if(catg.equals("mobiles")) {
		
			
			 sgstAmount=(bill*7)/100;
			 cgstAmount=(bill*3)/100;
			 gstAmount=sgstAmount+cgstAmount;
				Discount=(bill*30)/100;
				int totalbills=gstAmount-Discount;
		
			System.out.println("sgst 7%"+sgstAmount);
			System.out.println("cgst 3%"+cgstAmount);
			//System.out.println("gstAmount 10%::"+gstAmount);
			System.out.println("Discount 30%::"+Discount);
			System.out.println("totalfinalbill::"+totalbills);
		
			
		}else if(catg.equals("electronics")) {
		
			 sgstAmount=(bill*10)/100;
			cgstAmount=(bill*5)/100;
			gstAmount=sgstAmount+cgstAmount;
		
			System.out.println("sgst 10%"+sgstAmount);
			System.out.println("cgst 5%"+cgstAmount);
			System.out.println("gstAmount"+gstAmount);
			
		}else if(catg.equals("clothes")) {
			
			 sgstAmount=(bill*5)/100;
			 cgstAmount=(bill*2)/100;
			gstAmount=sgstAmount+cgstAmount;
			Discount=(bill*30)/100;
		
			System.out.println("sgst 5%"+gstAmount);
			System.out.println("cgst 2%"+cgstAmount);
			System.out.println("gstAmount"+gstAmount);
			System.out.println("Discount"+Discount);
			
		}
		
		
		return gstAmount ;
		
		
		
		
	}
	
	
	public void Totalbill() {
		int mobilesBill=mobiles();
		int electronicsBill=electronics();
		int clothesBill=clothes();
		
		
		
	}
	
	public static void main(String[] args) {
		
		MethodCalling2 mc2=new MethodCalling2();
		
		
		mc2.Totalbill();
		
		
	}

}

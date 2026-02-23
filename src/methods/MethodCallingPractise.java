package methods;

public class MethodCallingPractise {
	
	package methods;

	public class MethodCalling2 {
		
		int total; 
		int gstAmount;
		
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
			System.out.println("Total Amount Of gst::"+gst);
			
			
			 int totalwithGst=total+gst;
			 System.out.println("Total Amount of totalWithGst::"+totalwithGst);
			 
			return totalwithGst;
		

		}
		
		public int gst(String catg,int bill) {
			
			int gstAmount = 0;
			
			if(catg.equals("mobiles")) {
				gstAmount=(bill*10)/100;
				
				
			}else if(catg.equals("electronics")) {
			gstAmount=(bill*15)/100;


				
			}else if(catg.equals("clothes")) {
				gstAmount=(bill*7)/100;
			
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


}

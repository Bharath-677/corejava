package oops;

public class Payment {
	
	public void pay(String paymentType,int amt) {
		System.out.println("payment type:: "+paymentType+" Amount"+amt);
		
	}
	
    public void pay(String paymentType,int amt,long cardNum) {
    	System.out.println("Payment type::"+paymentType+" amount"+amt+" card num"+" cardNum"+cardNum);
		
	}
     public void pay(String paymentType,int amt,String upiId) {
    	 System.out.println("Payment type::"+paymentType+" amount"+amt+" UpiId"+upiId);
	
}

	
	public static void main(String[] args) {
		Payment p1=new Payment();
		p1.pay("cash", 500);
		p1.pay("card payment", 1000, 123456789L);
		p1.pay("UPI", 100, "123Uip");
		
	}

}

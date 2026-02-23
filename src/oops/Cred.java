package oops;

public class Cred extends BillDesk {
	
	public void Loans() {
		System.out.println("CRED loans...");
	}
	public void UpiPayments() {
		System.out.println("CRED Upi Payments....");
	}
	public void Cards() {
		System.out.println("CRED Cards Payments....");
	}
	
	public void CibilScore() {
		System.out.println("CRED offering cibil Score....");
	}
	
	public static void main(String[] args) {
		Cred c=new Cred();
		c.Loans();
		c.UpiPayments();
		c.Cards();
		c.CibilScore();
		c.PaymentProcess();
	}

}

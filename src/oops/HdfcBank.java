package oops;

public class HdfcBank extends Cred {
	@Override
	public void Loans() {
		System.out.println("HDFC Loans....");
	}
	@Override
	public void UpiPayments() {
		System.out.println("HDFC UPI Payments...");	
	}
	@Override
	public void Cards() {
		System.out.println("HDFC Cards Payments....");
	}
	
	public void Cheque() {
		
		System.out.println("HDFC cheque Status....");
	}
	
	public static void main(String[] args) {
		
		HdfcBank h=new HdfcBank();
		h.Loans();
		h.UpiPayments();
		h.Cheque();
		h.CibilScore();
		h.PaymentProcess();
		
		
	}

}

package oops;

public class AccountService extends Account implements ATMService,onlineServisce {
     // hybrid inheritance
	// singe inheritance+multi inheritance
	
	public void accountType() {
		System.out.println("savings Account");
	}
	@Override
	public void fundsTransfer() {
		System.out.println("funds transfering using online service");
	}

	@Override
	public void Withdraw() {
		System.out.println("amount withdraw using ATM service");
}
	
	
	public static void main(String[] args) {
		
		AccountService ac=new AccountService();
		ac.accountType();
		ac.fundsTransfer();
		ac.Withdraw();
		ac.dispute();
		
	}
	

}

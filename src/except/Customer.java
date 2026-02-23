package except;

public class Customer {
	
	int bill=500;
	
	public void payment(int amount) {
		
		if(bill<amount) {
			System.out.println("payment success");
				
		}else {
			
			throw new insufficientFundsException("add Funds");
		}
	}

	
	public static void main(String[] args) {
		Customer c=new Customer();
		
		c.payment(100);
	}
}

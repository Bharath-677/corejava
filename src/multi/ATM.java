package multi;

public class ATM {
	
    volatile boolean maintananceMode=false;
	
	public void transactionProcess() {
		System.out.println("customer came to transaction process....");
		
	while (!maintananceMode) {
		// transaction process is going on
		// System.out.println("while loop is running....");
	}
	System.out.println("ATM is stoped for maintenance");
		
	}
	
	
	public void maintanance() {
		
		System.out.println("Admin chang maintanace mode");
		
		maintananceMode=true;
		
	}
    
	public static void main(String[] args) throws InterruptedException {
		
		ATM atm=new ATM();
		
		Thread atmTransaction=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			 atm.transactionProcess();
			}
		});
		atmTransaction.start();
		
		Thread.sleep(4000);
		
		atm.maintanance();
	}
}

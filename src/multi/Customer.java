package multi;

public class Customer {
	
	int bankBal=0;
	
	public synchronized void withdraw(int withdrawAmount) throws InterruptedException {
		
		System.out.println("customer came to withdraw amount....");
		
		if(bankBal<withdrawAmount) {
			
			System.out.println("sorry sir we don't have enough amount, plz wait some tome.....");
			
			wait();	
			
		}
		
		System.out.println("customar withdraw amount successfully");
		
		bankBal=bankBal-withdrawAmount;
		
	}
	
	public synchronized void deposite(int depositeAmount) {
		
		System.out.println("customer came to deposite the amount");
		
		bankBal=bankBal+depositeAmount;
		
		System.out.println("customer deposite successfully");
		
		System.out.println("notifying.............");
		
		notify();
		notifyAll();
		
		
	}
   
	
	}
	


package multi;

public class Airtel extends Thread { // extends to the thread class
	
	
	
	@Override
	public void run() {  // override the run method
		
		System.out.println("Run method");
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Airtel a1=new Airtel();  // we have to create object for class 
		
		Thread t1=new Thread(a1); // we hava to create object for the thread class
		            // to start the thread we are used start() method from thread class reference 
		t1.start();   // then thread will start and call the run method
		
	}
	
	
	
	

}

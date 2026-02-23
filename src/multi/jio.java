package multi;

public class jio extends Thread { // extends the class

	@Override
	public void run() { // override the run() method
		Long num =6301768241L;
		double bal=550;
		String simholdername="Bharath";
		
		System.out.println("pH num::"+num+" "+"Recharge Balance::"+bal+" "+" Sim Holder Name::"+simholdername );
		
		
		
	}
	
	public static void main(String[] args) {
		
		jio j1=new jio(); // we heave to creat object for the class 
		//j1.run();
		Thread t1=new Thread(j1);  // net we heave to creat object for the thread class
		                   // to start the thread  we are using start() method for thread
		t1.start();  // 
		
		
	}
	
}

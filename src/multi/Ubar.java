package multi;

public class Ubar extends Thread {
	
	// it will lock the entair method by adding synchronized key word
	// so that it will execute one thread after another thread
	// it is thread safe and low productivity
	
	
	
	@Override
	public   void run() {
		
     Data();		
	}
	
	public static synchronized void Data() {  // method lock
		
		for(int i=0; i<10; i++) {
		System.err.println(" Thread Id::"+Thread.currentThread().getId());	
		
			
		}
	}
      // Data consistancy
	public static void main(String[] args) { 
		Ubar u1=new Ubar();                  // u1 lock
		
		Thread t1=new Thread(u1);  // t1=21
		t1.start(); 
		
		Thread t2=new Thread(u1);  // t2=22
		t2.start();
		          
		Ubar u2=new Ubar();                  //u2 lock
		
		Thread t3=new Thread(u2); // t3=24
		t3.start();
		
		Thread t4=new Thread(u2); // t4=25
		t4.start();
		
		
		
		
		
	}
}

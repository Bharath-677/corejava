package multi;

public class Zomato extends Thread{
	
    @Override
	public void run() {
		// 3rd running - execution of run method
		for(int i=0; i<10; i++) {
			System.out.println("Thread Id::"+Thread.currentThread().getId());
			
			try {
				Thread.sleep(3000);  // waiting state
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		// 4th dead - completion of run method execution
		
	}
	public static void main(String[] args) {
		
		Zomato z1=new Zomato(); 
		
		Thread t1=new Thread(z1);  // 1st Born or new - creating thread object
		
		t1.start(); // 2nd runnable - starting a thread
		
		t1.start();
		
		
	}
}

package multi;

public class BSNL implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Thread Id-"+Thread.currentThread().getId());
				
		}
		
	}
	
	public static void main(String[] args) {
		
		BSNL b1=new BSNL();
		
		Thread t1=new Thread(b1); //20
		t1.start();
		
		Thread t2=new Thread(b1); //21
		t2.start();
		
		Thread t3=new Thread(b1); //22
		t3.start();
		
	}

}

package multi;

public class DeadLock {
	
	// two different objects threads are  waiting for each other locks
	// but both threads are  don't releas the locks
	
	public static void main(String[] args) {
		
		String lock1="Bharath";
		String lock2="Naveen";
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (lock1) {
				System.out.println("t1 thread aquaired::"+lock1);
				
				synchronized (lock2) {
					System.out.println("t1 thread aquaired::"+lock2);
				}
		 		}
				
			}
		});
		t1.start();
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (lock2) {
				System.out.println("t2 thread aquaired::"+lock2);
				
				synchronized (lock1) {
					System.out.println("t2 thread aquaired::"+lock1);
				}
				}
				
			}
		});
		
		t2.start();
		
		
	}

}

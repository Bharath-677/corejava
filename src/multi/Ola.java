package multi;

public class Ola extends Thread {
	
	// we are using synchronized block to the for loop .it hepls to the one thread after another thread is exicute
	// so that data will consistancy 
	
	@Override
	public void run() {
		
		synchronized (this) {
			
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Thread Id::"+Thread.currentThread().getId()+"i::"+i);
				
		}
		}
		for(int j=11; j<20; j++) {
			
			System.out.println(" Thread Id::"+Thread.currentThread().getId()+"j::"+j);
			
		}
		
	}

	
	public static void main(String[] args) {
		
		Ola o1=new Ola();
		
		Thread t1=new Thread(o1);   // 21
		t1.start();
		
		Thread t2=new Thread(o1);   // 22
		t2.start();
		
	}
	
}

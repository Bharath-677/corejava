package multi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTask implements Runnable {
	//executors is a frame work
	//using executors we no need to creat threads  manually
	//we can define number of threads in executors, those threads can perform multiple tasks
	//generally we will definde number of threads using new fixed threadpool(); from executors class
	//so this will return the executor service
	//then we hava to submit the tasks
	//after that we have to sut down the executor service
	
	
	private int transactionId;

	public TransactionTask(int transactionId) {
		super();
		this.transactionId = transactionId;
	}

	@Override
	public void run() {
	System.out.println("Transaction Id::"+transactionId+" is processing... by::"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		ExecutorService es= Executors.newFixedThreadPool(3);
		
		    es.submit(new TransactionTask(101));
		    
		    es.submit(new TransactionTask(102));
		    es.submit(new TransactionTask(103));
		    es.submit(new TransactionTask(104));
		    es.submit(new TransactionTask(105));
		    
		    es.shutdown();
		
		
	}
	

}

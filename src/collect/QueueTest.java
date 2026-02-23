package collect;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	
	// first in first out

	public void queuetest() {
		
		
		Queue<Integer> q= new LinkedList<>();
		               q.add(12);
		               q.add(14);
		               q.add(16);
		               q.add(18);
		               q.add(20);
		               
		               q.remove();
		               
		               q.remove();
		               
		               for(Integer i:q) {
		            	   System.out.println(i);
		            	   	   
		               }
	}
	
	public void PriorityqueueTest() {
		
	PriorityQueue<String> pq=new PriorityQueue<>();
	
	                     pq.add("aa");
	                     pq.add("cc");
	                     pq.add("kk");
	                     pq.add("gg");
	                     pq.add("ll");
	                     pq.add("mm");
	                     
	                     pq.remove();
	                     pq.remove();
	                     
	                     for(String s:pq) {
	                    	 System.out.println(s);
	                    	 
	                     }
	                     
	
		
		
		
		
	}
	public static void main(String[] args) {
		
		QueueTest q1=new QueueTest();
		//q1.queuetest();
		q1.PriorityqueueTest();
		
	}
	
}

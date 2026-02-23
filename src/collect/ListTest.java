package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
	public void ArrayListTest() {
		
		//<> - generic
		//<E> - element type - use only classes
		// type - integer, String,Double,employee,Customer,
		// add() method  is adding data
		// get() method is read the data
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		// arrayList is a class ,which is child of list interface
		// it is index base structure in java 
		// initial capacity is 10
		// size will increasa in 50 %
		// it is asyncronus
		// get method is more frequent than remove and add methods
		
		
		                    a1.add(10);
		                    a1.add(20);
		                    a1.add(30);
		                    a1.add(40);
		                    a1.add(50);
		                    
		                  a1.add(2, 35);
		                  
		                  a1.remove(4);
		                  
		                  
		               
		                       
		                    for(int i=0;i<a1.size();i++) {
		                    	System.out.println(a1.get(i));
		                    	
		                    }
		                    
		                    System.out.println("========for each ===========" );
		                    
		                    for(Integer val:a1) {
		                    	
		                    	System.out.println(val);
		                    	
		                    }
			
	}
	
	public void LinkedListTest() {
		
		// it is a class ,which is list interface
		// it is node based data structure 
		// initial capacity is zero
		
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		         l1.add(10);
		         l1.add(20);
		         l1.add(30);
		         l1.add(40);
		         
		        l1.add(1, 25);
		        
		        l1.remove(0);
		        
		        
		         
		         
		         for(int i=0; i<l1.size(); i++) {
		        	 
		        	 System.out.println(l1.get(i));	 
		         }
		         System.out.println("===================for each loop =====================");
		         
		         for(Integer val:l1) {
		        	 System.out.println(val);
		        	 
		         }	
	}
	public void VectorTest() {
		
		// it is legasy class
		// syncronized
		// initial capacity is 10
		// size will increased in double
		
		
		
		Vector<String> v1=new Vector<String>();
		
		             v1.add("Bharath");
		             v1.add("vamsi");
		             v1.add("Naveen");
		             v1.add("nagendhra");
		             v1.add("venkatesh");
		             
		             v1.add(2, "Kumar");
		             
		             v1.remove(5);
		             
		             for(String name:v1) {
		            	 System.out.println(name);
		            	 
		            	 
		             }
			
	}
	
	public void StackTest() {
		
		// first in last out
		// we are adding the element used push() method
		// and remove the element using  pop() method
		// to show the which element is removed using peek() method
		
		Stack<String> s1=new Stack<String>();
		
		             s1.push("Bharath");
		             s1.push("venu");
		             s1.push("adi");
		             s1.push("ganesh");
		             s1.push("sri");
		             
		             s1.pop();
		             s1.pop();
		             
		             System.out.println( s1.peek());
		             for(String name:s1) {
		            	 System.out.println(name);
		            	 
		            	 
		             }
		
		
	}
	
	
     public static void main(String[] args) {
    	 
	  ListTest lt=new ListTest();
	  
	  // lt.ArrayListTest();
	// lt.LinkedListTest();
	 // lt.VectorTest();
	 lt.StackTest();
	

}
}

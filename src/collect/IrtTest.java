package collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IrtTest {
	
	
	public void iteratorTest() {
		
		// it travels data from forward direction
		// asyncronus
		// non legacy  class
		// we are using iterator() methods to store the data
		//hasnext() method we are checking the value is prestent or not' it will present print the data with the help of next() method
		List<Integer> al=new ArrayList<Integer>();
		             al.add(10);
		             al.add(20);
		             al.add(30);
		             al.add(40);
		             
		         Iterator<Integer> itr=al.iterator();
		         while(itr.hasNext()) {               // condition - true / false
		        	 System.out.println(itr.next());  // execution
		        	 
		        	 
		         }	
		
	}
	
	public void ListIteratorTest() {
		
		// it travels data from forward to backward direction
		// and backward to forward direction
		// asyncronus and non - legacy class
		
		List<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
    
        al.add(30);
        al.add(40);
        
    ListIterator<Integer> litr=al.listIterator();
	
	  while(litr.hasNext()) { // condition - true / false
	  
	  System.out.println(litr.next()); }
	 
    
    System.out.println("========================");
    
    while(litr.hasPrevious()) {
    	
    	System.out.println(litr.previous());
    }
    
	}
	
	public void enumerationTest() {
		
		// it is legacy class
		
		
		Vector<String> v1=new Vector<String>();
		               v1.add("Bharath");
		               v1.add(" vamsi");
		               v1.add("naveen");
		               v1.add("nagendhra");
		               
		               Enumeration<String> en=v1.elements();
		               
		               while(en.hasMoreElements()) {
		            	   
		            	  System.out.println(en.nextElement()); 
		               }
		               
		
		
	}
	
	public static void main(String[] args) {
		
		IrtTest it=new IrtTest();
		
		//it.iteratorTest();
		//it.ListIteratorTest();
		it.enumerationTest();
		
		
	}

}

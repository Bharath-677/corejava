package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	
	public void hashSetTest() {
		
		// it is class, which is child of set interface
		// it not followes insertion order
		// it not allowes null values
		// it is internally working like hashmap
		
		Set<Integer> s1=new HashSet<Integer>();
		
		            s1.add(10);
		            s1.add(20);
		            s1.add(30);
		            s1.add(40);
		            
		            s1.add(30);
		            
		            s1.add(50);
		            
		            for(Integer i:s1) {
		            	System.out.println(i);
		            	
		            	
		            }
	}
     public void LinkedhashSetTest() {
    	 
    	 LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
    	 
    	  l1.add(10);
          l1.add(20);
          l1.add(30);
          l1.add(40);
          l1.add(70);
          l1.add(null);

          l1.add(50);
          
          for(Integer i:l1) {
          	System.out.println(i);
    	 
    	 
          }	 
     }
	
     
     public void TreeSetTest() {
    	 
    	 TreeSet<Integer> ts=new TreeSet<Integer>();
    	 
    	 ts.add(10);
         ts.add(20);
         ts.add(30);
         ts.add(40);
         ts.add(70);
         //ts.add(null);

         ts.add(50);
         
         for(Integer i:ts) {
         	System.out.println(i);
    	 
         } 
     }
	
	
	public static void main(String[] args) {
		
		SetTest st=new SetTest();
		//st.hashSetTest();
		//st.LinkedhashSetTest();
		st.TreeSetTest();
		
		
	}
}

package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;


public class FailSafeTest {
	
public void onMap() {
	
	Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
	
	                map.put(101, "AMC");
	                map.put(102, "KFC");
	                map.put(103, "Dominos");
	                map.put(104, "MC Donalds");
	                map.put(105, "Pizza Hut");
	                
	                for(Entry<Integer, String>entry:map.entrySet()) {
	                	
	                	if(entry.getKey()==103) {
	                		
	                		//map.put(107, "Burger King");
	                	map.remove(102);	
	                		
	                	}
	                	System.out.println(entry); 	
	                }
	
}	

    public void onList() {
    	
    	List<Integer> l1=new CopyOnWriteArrayList<Integer>();
    	
    	l1.add(10);
    	l1.add(20);
    	l1.add(30);
    	l1.add(40);
    	l1.add(50);
    	
    	for(Integer i :l1) {
    		
    		if(i==20) {
    			l1.remove(1);
    			
    		}
    		System.out.println(i);
    		
    	}
    	System.out.println("======================");
    	for(Integer i:l1) {
    		System.out.println(i);
    		
    	}
    	
    	
    }
    
    public void onset() {
    	
    	Set<Integer> st=new CopyOnWriteArraySet<Integer>();
    	
    	st.add(11);
    	st.add(12);
    	st.add(13);
    	st.add(14);
    	st.add(15);
    	st.add(16);
    	
    	for(Integer i:st) {
    		System.out.println(i);
    	
    		if(i==12) {
    			st.remove(13);
    		}
    	}
    	
    	
    }



public static void main(String[] args) {
	
	
	FailSafeTest ft=new FailSafeTest();
	
	   // ft.onMap();
	   // ft.onList();
	  ft.onset();
	
	
}

}

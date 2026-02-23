package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentData {
	
	public void onMap() {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "ABC");
		map.put(102, "XYZ");
		map.put(103, "DEF");
		map.put(104, "KLM");
		
		for(Entry<Integer, String>entry:map.entrySet()) {
			
			
			
			System.out.println(entry);
			
		}
		
		
		
	}
	
	public void onList() {
		
		List<Integer> lt=new CopyOnWriteArrayList<Integer>();
		
		
		lt.add(101);
		lt.add(102);
		lt.add(103);
		lt.add(104);
		
		
		
		for(Integer i:lt) {
			
			if(i==104) {
				lt.add(105);
			}
			System.out.println(i);
		
		}
		System.out.println("========================");
		for(Integer i:lt) {
			System.out.println(i);
			
			
		}	
	}
	
	public void onSet() {
		
		Set<Integer> s1=new CopyOnWriteArraySet<Integer>();
		             s1.add(101);
		             s1.add(102);
		             s1.add(103);
		             s1.add(104);
		             
		             
		             for(Integer i:s1) {
		            	 
		            	 s1.add(105);
		            	 
		            	 System.out.println(i);
		             }
		
		System.out.println("==================");
		for(Integer i:s1) {
			System.out.println(i);
			
			s1.remove(20);
		}
		
	}
	public static void main(String[] args) {
		
		ConcurrentData c1=new ConcurrentData();
		
		 // c1.onMap();
		 // c1.onList();  
		   c1.onSet();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}

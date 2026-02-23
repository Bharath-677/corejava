package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	
	private LinkedHashMap String;


	public void hashMapTest() {
		
		// hashmap is a class,which is child of map intereface
		// it don't follows any insertion orde
		// it not allows duplicate keys,and values may be duplicate
		// if you are provide duplicate key's it will be override
		// it allows one null key ,and multiple null values
		// values will stored in hash buckets
		// has bucket size is 16
		// it is non legacy class ,asynchronous
		
		Map<String, String> map=new HashMap<String, String>();
		
		                        map.put("NA2233GD", "Nagendhra");
		                        map.put("NA3344VE", "Naveen");
		                        map.put("VA5566SI", "Vamsi");
		                        map.put("BH123th", "Bharath");
		                        
		                        map.put("null", " sanju");
		                        
		                        map.put("SAN123JU", " sanju");
		                        
		                        for(Entry<String, String>entry:map.entrySet()) {
		                        	
		                        	System.out.println(entry);
		                        	  	
		                        }	
	}
	
	public void LinkedHasMapTest() {
		
		// it is same in hashmap but followes in insertion order
		
		Map<String, String> map=new LinkedHashMap<String, String>();
		
        map.put("BH123th", "Bharath");
        map.put("NA2233GD", "Nagendhra");
        map.put("NA3344VE", "Naveen");
        map.put("VA5566SI", "Vamsi");
        
        map.put("null", "sanju");
        map.put("KU213AR", "Bharath");
        
        
        
        for(Entry<String, String>entry:map.entrySet()) {
        	
        	System.out.println(entry);
        	   	
        }
			
	}
	
	public void TreeMapTest() {
		
		// it followes shorting order
		// and it don't allowes null keys
		
		Map<String, String> map=new TreeMap<String, String>();
		
        map.put("BH123th", "Bharath");
        map.put("NA2233GD", "Nagendhra");
        map.put("NA3344VE", "Naveen");
        map.put("VA5566SI", "Vamsi");
        
        for(Entry<String, String>entry:map.entrySet()) {
        	
        	System.out.println(entry);
        	
        	
        }
		
	}
	
	
	public void hashTableTest() {
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		
		               ht.put("BH123AR", 101);
		               ht.put("NA2233GD",  102);
		               ht.put("NA3344VE", 103);
		               ht.put("VA5566SI", 104);
		             
		               ht.put(null,105);
		               
				
		
		for(Entry<String,Integer>entry:ht.entrySet()) {
			
			
			System.out.println(entry);
			
		}
		
		
		
	}
	
	
         public static void main(String[] args) {
	        MapTest m1=new MapTest();
	
	        //  m1.hashMapTest();
	        //  m1.LinkedHasMapTest();
	        //  m1.TreeMapTest();
	          m1.hashTableTest();
}
}

package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts>{
	
	int id;            // declaration
	String name;
	double price;
	
	
	public TataProducts(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public int compareTo(TataProducts o) {
		//
		
		// return this.name.compareTo(o.name);  // based on name sorting
		
		  return (int) (this.price-o.price); // Based on price sorting
	      //	return this.id-o.id; // based on id sorting
	}
	
	
	
	@Override
	public String toString() {
		return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		
		TataProducts t1=new TataProducts(101, "TCS", 12.5);
		TataProducts t2=new TataProducts(102, "Tanishqu", 32.5);
		TataProducts t3=new TataProducts(104, "TATA Salt", 2.5);
		TataProducts t4=new TataProducts(105, "Titan", 82.5);
		TataProducts t5=new TataProducts(106, "TATA Water", 62.5);
	
		List<TataProducts> list=new ArrayList<TataProducts>();
		
		                  list.add(t1);
		                  list.add(t2);
		                  list.add(t3);
		                  list.add(t4);
		                  list.add(t5);
		
		                  Collections.sort(list);
		                  
		                  for(TataProducts i:list) {
		                	  
		                	System.out.println(i);  
		                  }
		
		
	}


	
	}
	



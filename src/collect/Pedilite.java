package collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pedilite {

	Integer id;
	String name;
	Double price;
	
	
	
	public Pedilite(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Pedilite [id=" + id + ", name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		
		Pedilite p1=new Pedilite(103, "fevic0l", 10.5);
		Pedilite p2=new Pedilite(102, "m-seal", 5.5);
		Pedilite p3=new Pedilite(101, "fevikwik", 12.5);
		Pedilite p4=new Pedilite(104, "anabond", 40.5);
		
		List<Pedilite> list=Arrays.asList(p1,p2,p3,p4);
		
	     // BasedonId bid=new BasedonId();
	     // Collections.sort(list, bid);
	      
	    //  BasedonName bname=new BasedonName();
	    //  Collections.sort(list, bname);
	      
		 
		// Collections.sort( list,new BasedonName());
		 //Collections.sort(list, new BasedonId());
		// Collections.sort(list, new Basedonprice());
		
	      String property="id";
	      String OrderType="ASC";
	      
	      if(property.equals("pname")){
	    	  Collections.sort(list, new BasedonName());  
	      } else if(property.equals("id")) {
	    	  
	    	  Collections.sort(list, new BasedonId());
	    	  
	      } else if(property.equals("price")) {
	    	  Collections.sort(list, new Basedonprice());
	    	  
	      } 
	      
	      if(OrderType.equals("DEC")) {
	    	  
	    	  Collections.reverse(list);
	    	  
	      }
	      
	      
	      
	      
	      
		for(Pedilite p:list) {
			System.out.println(p);
			
			
		}
	}

	
	
}

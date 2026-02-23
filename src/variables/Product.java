package variables;

public class Product {
	
	String name="Samsung";  //instant variable
	
	static double amt=300000.0;  //static variable
	
	public static void main(String[] args) {
		
		int prodid=1234;    //Local Variable
		
		System.out.println("ProductId:"+prodid); 
		
		
		Product pro=new Product();   //Object
		
		System.out.println(pro.name);   ///Ref.variable
		
		System.out.println(Product.amt);  //classname.variable name
		
	}

}

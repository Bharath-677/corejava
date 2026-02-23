package variables;

public class DataTypes2 {
	
	public static void main(String[] args) {
		
		//Objective data types are -9
		//All Objective data types & classes
		
		Byte id=123;
		Short num=12345;
		Integer valu=37439402; 
		Long mobile=6301763455L;
		
		Float miles=1.23f;
		Double amt=2000.34;
		
		Character grade='a';
		Boolean areYouIndian=true;
		String name="Teja IT";
		
		
		System.out.println("Id:"+id);
		System.out.println("num:"+num);
		System.out.println("Valu:"+valu);
		System.out.println("Mobile num:"+mobile);
		System.out.println("miles:"+miles);
		System.out.println("Amount:"+amt);
		System.out.println("Grade:"+grade);
		System.out.println("areYouIndian"+areYouIndian);
		System.out.println("Name:"+name);
		
		
		Product prod=new Product();
		
		System.out.println(prod.name); 
		System.out.println(Product.amt);
		
		
		
	}
	
	
	

}

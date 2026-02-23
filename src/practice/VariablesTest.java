package practice;

public class VariablesTest extends VariablesTest1{
	
	int i=12;//instance variable
	static int i1=456; // static variable
	
	
	public void m1() { //instance method
		
		int i=10;
		String name="Bharath";
		
		System.out.println(i); // local variable
		System.out.println(this.i); // this key word
		System.out.println(super.i); // super key word
		System.out.println(name);
	
		int amount;
		amount=20;
		System.out.println(amount);
	
	
	}
	 public static void m2() {   //static method
		System.out.println("this is Static method");
	
	
	}
	public static void main(String[] args) {
		
		int id=1234; // local variable
	
		VariablesTest v=new VariablesTest(); //object
		v.m1();
		v.m2();
		
		System.out.println(i1);
		
		
		
	
		
		
	}

}

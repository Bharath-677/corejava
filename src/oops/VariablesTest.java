package oops;

public class VariablesTest extends VariablesParent {
	// instance variable & local variable name is same it will give first preference to the local variable
	// but if you want instance variable data so we need to use this key word
	// super class& sub class instan variables and local variables names are same 
	//but we need to acces the super class data so we are using super
	
	int id=10;
	
	public void test() {
		
	     int id=20;
		
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
	
	
	public static void main(String[] args) {
		
		VariablesTest v=new VariablesTest();
		v.test();
		
		
		
		
	}

}

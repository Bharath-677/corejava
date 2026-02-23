package oops;

public class Overloading2 {
	// no.of parameters are same but order is different in same class
	
	
	public void m1(int id) {
		System.out.println("int parameter::"+id);
	}
	public void m1(String name) {
		
		System.out.println("String parameter::"+name);
	}
	public void m1 (double amt) {
		System.out.println(" double Parameter::"+amt);
		
	}
	
	public static void main(String[] args) {
		
		Overloading2 o2=new Overloading2();
		o2.m1(11);
		o2.m1("Bharath");
		o2.m1(5000);
	
	}

}

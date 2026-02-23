package oops;

public class Overloading1 {
	//compeltimepolymorphism or overloading
	// method name is same & number of parameters are different in same class
	// are number of parameters are same & order is different in same class
		
	public void m1() {
		
		System.out.println("This is m1 Method");
	}
	
	public void m1(int id) {
		System.out.println("this is m1 Method"+id);
	}
	
	public void m1(int i,String name) {
		System.out.println("this is m1 method...i::"+i+"name::"+name);
		
	}
	
	public static void main(String[] args) {
		Overloading1 o1=new Overloading1();
		o1.m1();
		o1.m1(11);
		o1.m1(123,"Bharath");
		
	}

}

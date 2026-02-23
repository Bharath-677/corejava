package oops;

public class Overloading3 {
	// if no,of parameters are same ,than data types are different
	// no,of parameters are same,data types are same & order of parameters are different in same class
	public void m1(int id,String name) {
		System.out.println("id:: "+id+" name:: "+name);
	}
	public void m1(String name,int id) {
		System.out.println("name:: "+name+" id::"+id);
	}
	
	public static void main(String[] args) {
		
		Overloading3 o3=new Overloading3();
		o3.m1(11, "Bharath");
		o3.m1("Bharath", 11);
	}

}

package oops;

public class Child extends Parent {
	@Override
	public void m1() {
		
		System.out.println("Child m1 method");
	}
	public void m2() {
		
		System.out.println("Child m2 Method");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		
	}

}

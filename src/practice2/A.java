package practice2;

public class A {
	
	public void m1(int id,String name) {
		
		System.out.println("ID::"+id+"name::"+name);
		
		
	}
	
	
	
	public void m2() {
		
		int id =123;
		String name="naveen";
		
		System.out.println("Id::"+id+"name::"+name);
		
	}
	
	public void m3(int id) {
		
		System.out.println("id"+id);
	}
	
	public int m4() {
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		A a1=new A();
		
		a1.m1(1, "bharath");
		a1.m2();
		
	}
	

}

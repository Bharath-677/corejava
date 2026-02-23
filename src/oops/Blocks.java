package oops;

public class Blocks {
	
	// Static block no need to creat object
	// instance blocks and constractor need to creat object
	
	
	public Blocks() {
		System.out.println("constractor");
		
	}
		
	
	
	{
		System.out.println("instance Blocks");
	}
	
	
	static{
		
		System.out.println("Static Blocks");
	}
	
	
	public void m1() {
		
		System.out.println("Instance method");
	}
	
	
	public static void main(String[] args) {
		Blocks b=new Blocks();
		b.m1();
	}

}

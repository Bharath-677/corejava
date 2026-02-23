package practice;

//child
public class BB extends AA {
	
	@Override
	public void m1() {
		System.out.println("this is child m1 method");
	}
	
	@Override
	public void m2() { //private methods we can't override
		System.out.println("this is child m2 method");
	}
	
	@Override
	public void m3() {  // final methods we can't override
		System.out.println("this is child m3 method");
	}
	
	@Override
	public void m4() {  // static methode we can't override
		System.out.println("this is child m4 method");
	}
	
   public static void main(String[] args) {
	
	   BB b=new BB();
	   
	   b.m1();
	   b.m2();
	   b.m3();
	   b.m4();
	   
	   
	   
	   
}



}

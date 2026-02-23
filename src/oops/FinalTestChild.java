package oops;

public class FinalTestChild extends FinalTestParent{
	int id=13;
	
	@Override
	public void m1() {
		
		System.out.println("This is m1 Method");
	}
	
	public void m2(){
		id=15;
		System.out.println("This is m2 method");
		
	}
public static void main(String[] args) {
	FinalTestChild ft=new FinalTestChild();
	ft.m1();
	ft.m2();
}
}

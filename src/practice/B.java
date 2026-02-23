package practice;

//child class
public class B extends A{
	
	
	int i=15;
	public void car() {
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		
		System.out.println("this is B car method");
	}
	
	public void bike () {
		System.out.println("this is B bike method");
	}
	
	
	public static void main(String[] args) {
		
		B b=new B();  //we can creat sub class object we can acces sub class data & all super class data
		b.car();
		b.bike();
		b.gold();
		
		System.out.println("==================================");
		
		A a=new A(); //we can creat super class object we can acces super class data only
		a.gold();
		a.car();
		
		System.out.println("============================");
		
		A a1=new B(); //we can creat super class reference 
		  a1.gold(); //and sub class object we can't  acces sub class specific methods
		  a1.car();            
	
	
	
		
	}

}

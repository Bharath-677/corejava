package methods;

public class MethodsParameter {
	
	public void m1() {
		System.out.println("Zero Parameter");
	}
	
	public void m2(int id) {
	System.out.println("one Parameter::"+id);	
	}
	
	public void m3(String name) {
		System.out.println("one Parameter....String value::"+name);
		
	}
	
	public void m4(int id,String name) {
		
		System.out.println("Two Parameters::"+id+""+name);
	}
 
	public void m5(int i,long l,double amt) {
		System.out.println("Three parameters::"+i+" "+l+" "+amt);
	}
	
	public void m6 (int in, float f,char c,boolean bool) {
		System.out.println("four parameters::"+in+" "+f+" "+c+" "+bool);
		
	}
	
	public static void main(String[] args) {
		
		MethodsParameter mpt=new MethodsParameter();
		
		mpt.m1();
		mpt.m2(7);
		mpt.m3("Teja");
		mpt.m4(11, "Your Java Stop!");
		mpt.m5(12, 12340, 2000.00);
		mpt.m6(8, 1.7f, 'B', false);
		
	}

}

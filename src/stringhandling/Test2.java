package stringhandling;

public class Test2 {
	
	public void m1(String str) {
		
		System.out.println("String...."+str);
	}

    public void m1(StringBuffer sbu) {
		
    	System.out.println("String buffer"+sbu);
		
	}

    public void m1(StringBuilder sbi) {
    	System.out.println("String builder"+sbi);
	
	
}

   public static void main(String[] args) {
	Test2 t1=new Test2();
	
	// t1.m1(null);// ambiguity problem
	
	t1.m1("Java");
	
	
	StringBuffer sbu=new StringBuffer("String buffer value");
	
	t1.m1(sbu);
	
	
	StringBuilder sbi=new StringBuilder("String builder vale");
	
	t1.m1(sbi);
}
}

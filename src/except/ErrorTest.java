package except;

public class ErrorTest {
	// StackOverflowError
	
	public void m1() {
		
		System.out.println("this is m1 method");
		
		m2();
	}
	
    public void m2() {
		
		System.out.println("this is m2 method");
		
		m3();
		
	    }
	
    public void m3() {
	
	System.out.println("this is m3 method");
	
	m4();
	
    }

    public void m4() {
	
	System.out.println("this is m4 method");
	
	m1();
	
     }

	
	public static void main(String[] args) {
		ErrorTest et=new ErrorTest();
		et.m1();
		
	}

}

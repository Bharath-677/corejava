package except;

public class ExceptionTest3 {
	
	public int m1() {
		
		try {
		int i =100;
		int j=2;
		int k=i/j;
		System.out.println("k value::"+k);
		
	  return 10;
		}catch (Exception e) {
			
			e.printStackTrace();
			
			return 20;
			
		}finally {
			
			return 30;
		}
	}
public static void main(String[] args) {
	
	ExceptionTest3 et3=new ExceptionTest3();
	
	System.out.println(" Return Value::"+et3.m1());
	
	
}
}

package except;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		try {
		int i=10;
		int j=0;
		int k=i/j;
		
		System.out.println(k);
		}catch (ArithmeticException e) {
			e.printStackTrace();
			
		}	catch (RuntimeException e) {
		e.printStackTrace();
		
		}catch (Exception e) {
			e.printStackTrace();
			
		} catch (Throwable e) { 
		     e.printStackTrace();
			
		}	
		
	}

}

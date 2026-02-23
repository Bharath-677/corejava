package loops;

public class ForTest2 {
	
	public void test() {
		// 1              2           4
	//initialization & Condition & increment/decrement	
		
		for(int i=20; i>0; i--) {
			
			                                 //  3
			System.out.println(i);   // Execution output -10,9,8,7,6,5,4,3,2,1
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ForTest2 ft2= new ForTest2();
		ft2.test();
		
	}

}

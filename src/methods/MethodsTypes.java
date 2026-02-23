package methods;


public class MethodsTypes {
	
	  // Methods are two types
		public int m1() {  //Instant method
			return 123;    // it will call by creating object reference.method name
		}

		public static int m2() {  //Static method
			return 12345;        // it will call class name.method name
		}
		
		public static void main(String[] args) {
			MethodsTypes mt=new MethodsTypes();
			System.out.println(mt.m1());
			System.out.println(mt.m2());
			
		}
		

}

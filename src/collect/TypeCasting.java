package collect;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		byte b=123;      // implicity type casting
		short sh=b;
		
		short sh1=12345;      // explicity type casting
		byte b1=(byte) sh1;
		
		int i=10;
		long l=i;              // implicity type casting
		System.out.println(l);
		
		
		long l2=500;
		int i2=(int)l2;      // explicity type casting
		
		
		double d=10000;
		float f=(float)d;  // explicity type casting
		
		
		String s2="Teja IT";
		Object obj1=s2;            // implicity  type casting
		
		
		Object obj="Bharath";
		String s1=(String) obj;        // explicity type casting
		
		
		
	}

}

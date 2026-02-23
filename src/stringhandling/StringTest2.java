package stringhandling;

public class StringTest2 {
	public static void main(String[] args) {
		
		// scp - doesn't allows the duplicate objects
		// before creating the new objects in scp , the object will compare to the .equals() method
		// if the same object available in scp , it don't creat new object
		// but heap memory always create new object, it doesn't consider dupication, bcz it does not compares to the .equals() method
		// scp is present inside the  heap memory
		
		String s1=new String("Java"); //object - heap 
		
		String s2="Teja";   // literal - scp 
		
		String s3=new String("Java");
		
		String s4="Teja";
		
		String s5="Java";
		
		String s6=new String("Teja");
		
		String s7="Bharath";
		
		String s8="Teja";
		
		String s9=new String("Teja");
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s6==s9);
		
		
		System.out.println("=================");
		
		// .equals compares the content, it doesn't care aboute the address, and memory location
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s6.equals(s9));
		
	
		
		
		
		
	}
	

}

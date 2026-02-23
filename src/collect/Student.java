package collect;

public class Student implements Cloneable{
	
	// clone ( ) method is object class method
	// it is cope the object
	// we are adding the colne () method in class showe be implemented in cloneable interface
	// other wise you will get colne not supported exception
	
	int id;
	String name;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Student s1=new Student();
		        s1.id=123;
		        s1.name="Bharath";
		        
		        System.out.println(s1.id+" "+s1.name);
		        
		        
		        Student s2=(Student)s1.clone();
		        
		        System.out.println(s2.id+" "+s2.name);
		
	}
	

}

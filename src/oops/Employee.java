package oops;

public class Employee {
	//constructor for initializing the data
	// constructor have no return type
	// we can creat object for constructor  
	
	
	
	public Employee() {
		
		System.out.println("constructor");
	}
	
	public Employee(int id) {
		System.out.println("int arg constructor id::"+id);
		
	}
	
	public Employee(int id,String name) {
		
		System.out.println("multiple arg constructor id::"+id+" name::"+name);
	}
	
	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e1=new Employee(7);
		Employee e2=new Employee(11, "Bharath");
		
	}

}

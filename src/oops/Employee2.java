package oops;

public class Employee2 {
	
	int id;        //declaration
	String name;
	long salary;
	public Employee2() {
		
		System.out.println("zero arg constructor");
	}
	
	public Employee2(int empid) {
		id=empid;  // re-initialization
		System.out.println("int arg constructor "+empid);
		
		
	}
	public Employee2(int empid,String empname) {
		
		id=empid;
		name=empname;
		System.out.println("int and string arg constructor");
			
	}
	public Employee2(int empid,String empname,long empsalary) {
		id=empid;
		name=empname;
		salary=empsalary;
		
		System.out.println("3 arg constructor");
	}
	
	
	public static void main(String[] args) {
		Employee2 e2=new Employee2();
		System.out.println(e2.id+" "+e2.name+" "+e2.salary);
		
		Employee2 e3=new Employee2(10);
		System.out.println(e3.id+" "+e3.name+" "+e3.salary);
		
	//	Employee2 e4=new Employee2(15, "Bharath");
	//	System.out.println(e4.id+" "+e4.name+" "+e4.salary);
		
		Employee2 e5=new Employee2(10, "Teja IT", 50000);
		System.out.println(e5.id+" "+e5.name+" "+e5.salary);
		
	}

}

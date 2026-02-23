package collect;

public class Employee {
	
	int id;
	String name;
	String city;
	
	
	public Employee() {
		
		
	}
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
public static void main(String[] args) {
	
	Employee e1=new Employee(101, "Bharath", "Guntur");
	System.out.println(e1.id+" "+e1.name+" "+e1.city);
	
	Employee e2=new Employee();
	         e2.id= 102;
	         e2.name="naveen";
	         e2.city="Hyderabad";
	         System.out.println(e2.id+" "+e2.name+" "+e2.city);
	
	Employee e3=new Employee(102, "Vamsi", "chennai");
// deep copy	           
	          e3.id=103;
          	e3.name="vamsi";
	       e3.city= "chennai";
	System.out.println(e3.id+" "+e3.name+" "+e3.city);
	
	
	
	 Employee e4=new Employee();
//shallow copy
	           e4=e3;
	           
	           System.out.println(e4.id+" "+e4.name+" "+e4.city);
}
}

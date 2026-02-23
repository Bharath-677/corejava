package oops;

public class Customer {
	int id;      //declaration
	String name;
	int salary;
	
	
	
	
	public Customer(int id, String name, int salary) {
		super();
		this.id =id;
		this.name =name;
		salary =salary;
	}
	public Customer( int id,String n,long amt) {
		this.id=id;
		
		
		
		
	}

public Customer() {
	
}


	public static void main(String[] args) {
		
		Customer c1=new Customer(123, "nagendra", 30000);
		//System.out.println(c1.id+" "+c1.name+" "+c1.salary);
		
		Customer c3=new Customer(12,"Naveen", 200000000);
		System.out.println(c3.id+" "+c3.name+" "+c3.salary);
		
	
		
		
	}

}

package oops;

public interface PhonePe {
	
	//interface allows only abstract methods or non-concret methods
	// abstract methods have no body so we can't write normal methods in interface
	// we can't creat object from the interface
	// we can't write constractor
	
	public static final int id=10; // default variables
	
	public PhonePe() {
		//we can't create constractor 
	}
	
	{
	//we can't creat instance blocks	
	}
	
	static{
		// we can't write static blocks
	}
	public abstract void ticketBooking();//declaration-abstract methods
	
	public static void main(String[] args) {
		PhonePe p=new PhonePe();// we can't creat object
	}
	
}

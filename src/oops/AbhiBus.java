package oops;

public class AbhiBus implements PhonePe {
	
	// class allows to write normal methods
	// class not allows to abstract methods
	
	@Override
	public void ticketBooking() {
		
		String from="Guntur";
		String to="Hyderabad";
		String name="Bharath";
		int ticketPrice=1000;
		String gender="male";
		String setNum="AB35";
		
		System.out.println("from::"+from);
		System.out.println("to::"+to);
		System.out.println("name::"+name);
		System.out.println("ticketPrice::"+ticketPrice);
		System.out.println("Gender::"+gender);
		System.out.println("SetNum::"+setNum);
		
	}
	
	
	public static void main(String[] args) {
		
		AbhiBus ab=new AbhiBus();
		ab.ticketBooking();
		
		
	}
	
	

}

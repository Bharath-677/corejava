package practice2;

public class RedBus implements PhonePe {

	@Override
	public void ticketBooking() {
		
		int num=22;
		String name="Bharath";
		String fromadd="Guntur";
		String toadd="Hyderabad";
		Long amt=500L;
		
		
		System.out.println("seatnum::"+num+"name::"+name+"from::"+fromadd+"to::"+toadd+"Amount::"+amt);
		
		
		
		
	}
	public static void main(String[] args) {
		
		RedBus r1=new RedBus();
		r1.ticketBooking();
		
		
	}
	

}

package practice;

public class SMBHall implements BookMyShow {

	@Override
	public void MovieTicket() {
		String moviename="MSVP";
		int seatnum=11;
		String name="Bharath";
		int age=23;
		double amt=500;
		
		System.out.println("Movie Name::"+moviename);
		System.out.println("seat number::"+seatnum);
		System.out.println("Name::"+name);
		System.out.println("age::"+age);
		System.out.println("Amount::"+amt);
		
	}
public static void main(String[] args) {
	SMBHall s=new SMBHall();
	s.MovieTicket();
	
	
	
}
	
	
	
}

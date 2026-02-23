package oops;

public class Nagachaitanya extends Nagarjuna{
	@Override
	public void car() {
		
		//System.out.println(" Child car");
	}
	
	public void resturant() {
		
		System.out.println("Child resturant");
	}
	
	
	
	public static void main(String[] args) {
		Nagachaitanya n1=new Nagachaitanya();
		
		n1.car();
		n1.resturant();
		n1.house();
		n1.land();
		n1.Annpurnastudio();
	}

}

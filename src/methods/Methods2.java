package methods;

public class Methods2 {
	
	public int mobilePrice(){
		System.out.println("Mobiles method called");
		return 123;
	}	
	public int electronicsPrice() {
		System.out.println("Electronics Method called");
		return 30000;
	}
	public double amount() {
		System.out.println("Amount method called");
		return 20.3;
	}
	
	public float miles() {
		System.out.println("miles method called");
		return 20.5f;
	}
	
	public String ProductName() {
		System.out.println("Productname method called");
		return "iphone";
	}
	
	public void something() {
		System.out.println("something method called");
		
	}
	
	public static void main(String[] args) {
		
		Methods2 m2=new Methods2();
		int mobilesPrice=m2.mobilePrice();
		int ElectronicsPrice=m2.electronicsPrice();
		double amount=m2.amount();
		float miles=m2.miles();
		String PRoductname=m2.ProductName();
		m2.something();
		
		System.out.println(mobilesPrice);
		System.out.println(ElectronicsPrice);
		System.out.println(amount);
		System.out.println(miles);
		System.out.println(PRoductname);
		
	}

}

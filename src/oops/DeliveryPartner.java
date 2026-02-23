package oops;

public class DeliveryPartner {
	// heri-key inheritance
	
	public void acceptOrder() {
		System.out.println("Order accepted by the Restuarent........");
	}
	public void pickupOrder() {
		
		System.out.println("pickup Order from Resturant..........");
	}
	
	public void deliverOrder() {
		
		System.out.println("Order Delivery by the DeliveryOrder............");
	}
	
	
	public static void main(String[] args) {
		
		DeliveryPartner dp=new DeliveryPartner();
		dp.acceptOrder();
		dp.pickupOrder();
		dp.deliverOrder();
	}

}

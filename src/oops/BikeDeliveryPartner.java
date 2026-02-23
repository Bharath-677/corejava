package oops;

public class BikeDeliveryPartner extends DeliveryPartner {
	
	public void wearHelmet() {
		
		System.out.println("Bike delivery Partner Wear Hemet...........");
	}
	@Override
	public void deliverOrder() {
		
		System.out.println("Delivery Order by Bike Delivery Partner.........");
	}
	
	
	public static void main(String[] args) {
		
		BikeDeliveryPartner bdp=new BikeDeliveryPartner();
		bdp.acceptOrder();
		bdp.pickupOrder();
		bdp.wearHelmet();
		bdp.deliverOrder();
		
	}

}

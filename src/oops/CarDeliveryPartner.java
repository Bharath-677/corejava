package oops;

public class CarDeliveryPartner extends DeliveryPartner {
	
	public void largeOrderSupport() {
		System.out.println("Car delivery Partner is Large Order Support.......");
		
	}
	@Override
	public void deliverOrder() {
		System.out.println("Dlivery Order By Car Delivery Partner...........");
	}
	
	public static void main(String[] args) {
		CarDeliveryPartner cdp=new CarDeliveryPartner();
		cdp.acceptOrder();
		cdp.pickupOrder();
		cdp.largeOrderSupport();
		cdp.deliverOrder();
		
	}

}

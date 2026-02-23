package oops;

public class CycleDeliveryPartner extends DeliveryPartner {
	
	public void ecoFriendly() {
		
		System.out.println("ecofriendly delivery by Cycle ........");
	}
	@Override
	public void deliverOrder() {
		
		System.out.println("Delivery order by  Delivery partner........ ");
	}
	
	
	
	public static void main(String[] args) {
		CycleDeliveryPartner cdp=new CycleDeliveryPartner();
		cdp.acceptOrder();
		cdp.pickupOrder();
		cdp.ecoFriendly();
		cdp.deliverOrder();
		
	}

}

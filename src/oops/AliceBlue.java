package oops;

public class AliceBlue extends NSE {

	@Override
	public void brokeragecharges() {
		System.out.println("AliceBlue Brokerage Charges 15 rupees");
		
	}
	public static void main(String[] args) {
		
	
	AliceBlue a=new AliceBlue();
	a.StockInfo();
	a.Ipo();
	a.holidays();
	a.brokeragecharges();
	}
}

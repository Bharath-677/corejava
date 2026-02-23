package oops;

public class Dhan extends NSE {

	@Override
	public void brokeragecharges() {
		System.out.println("Dhan Brokerage Charges 10 Rupees");
		
	}
	public static void main(String[] args) {
		Dhan d=new Dhan();
		d.StockInfo();
		d.Ipo();
		d.holidays();
		d.brokeragecharges();
	}
	
	

}

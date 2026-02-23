package oops;

public abstract class NSE {
	// abstract is a key word
	// adding abstract key word to the class it will make class as abstract class
	// it Show the nessesary data and hides the un-nessesary data
	// we can write abstract methode and normal methods
	//we can access child class's only
	// we can write instance blocks and static blocks
	//we can write construstor also
	//we can't write object 
	
    public void StockInfo() {
    	System.out.println("Infosys,TCS,jio,Zomato,bajaj,MRF,Nestle");
		
	}
	
	public void Ipo() {
		
		System.out.println("flipcart,blinkit,Amazon");
	}
	public void holidays() {
		System.out.println("Aug15,DEC25,May1");
		
	} 
	
	public abstract void brokeragecharges();
	
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("Static block");
	}
	
	public NSE() {
		System.out.println("constructor");
	}
	
	
	

}

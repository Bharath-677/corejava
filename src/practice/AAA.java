package practice;

public abstract class  AAA {
	
	// abstract is a key word
	// we are adding abstract key word to the class  it will make abstract class
	// it shows the necessary data and hides the un-nesessary data
	// we can provide implementation for the abstract class child class only
	
	public abstract void m1();// it allows the abstract methods
	
	public void m2() {
		// and it allows the normala methods
	}
	
	
	
	public AAA(){
		
		//we can write  constractor
	}
	
	{
		// it allows instance blocks 
		
	}
	
	
  static{
		
		// it allows static blocks
	}
	
	AAA a=new AAA();// we cant creat object for abstract class
	
	

}

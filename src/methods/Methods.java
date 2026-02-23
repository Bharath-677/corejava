package methods;

import variables.Methods;

public class Methods {
	
	

	public int mobiles() {
		System.out.println("Mobiles method");
		return 123;
	}
	public int amount() {
		System.out.println("Amount method");
		return 1000;
	}
	
	
	public static void main(String[] args) {
		
		Methods m=new Methods();
	
		System.out.println(m.mobiles());
		int SalaryAmount=m.amount();
		System.out.println(SalaryAmount);
		System.out.println(m.amount());
		
		int SalaryAmountWithBonus=SalaryAmount+500;
		System.out.println(SalaryAmountWithBonus);
	}

}

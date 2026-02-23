package variables;

public class PVPMall {
	
	int grocerice() {
		int pantrystaples=5000;
		int snacks=1000;
		int drinks=1000;
		int total= pantrystaples+snacks+drinks;
		return total;
	}

	int accessories() {
		int jewery=50000;
		int sunglasses=100;
		int watch=3000;
		int wallet=500;
		int total=jewery+sunglasses+watch+wallet;
		return total;
	}
	
	
	public static void main(String[] args) {
		
		PVPMall pm=new PVPMall();
		
	   int totalgrocerice=pm.grocerice();
		
		System.out.println("Groceries Bill:"+pm.grocerice());
		
		int totalaccessories=pm.accessories();
		System.out.println("Accessories Bill:"+pm.accessories());
		
		int totalBill=totalgrocerice+totalaccessories;
		System.out.println("Total Bill:"+totalBill);
		
		
		
		
		
		
	}
}

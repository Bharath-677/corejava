package methods;



public class Methods1 {
	

	public byte id() {
	return 123;
	}
	
	public int valu() {
		
		return 1234;
	}
	
	public short num() {
		return 12345;
	}
	
	public long mobil() {
		return 6301768241L;
	}

	public double amt() {
		return 20000.0;
	}
	
	
	public float mile() {
		return 2.3f;
	}
	
	public char grade() {
		return 'a';	
	}
	
	public boolean areyouhindu() {
		return true;
	}
	public String name() {
		return "Bharath";
	}
	
	
	public static void main(String[] args) {
		
		Methods1 m1=new Methods1();
		
		byte val=m1.id();
		int value=m1.valu();
		short numb=m1.num();
		
		System.out.println(val);
		System.out.println(value);
		System.out.println(numb);
		System.out.println(m1.mobil());
		System.out.println(m1.amt());
		System.out.println(m1.mile());
		System.out.println(m1.grade());
		System.out.println(m1.areyouhindu());
		System.out.println(m1.name());
	}

}

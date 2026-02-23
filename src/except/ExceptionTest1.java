package except;

public class ExceptionTest1 {
	
	public void Arthimatic() {
		
		// if you are print something valu by zero you well get arithmetic Exception
		
		System.out.println("Arthimatic Start............");
		try {
		int i=100;
		int j=0;
		int k=i/j;
		System.out.println(k);
		}catch (ArithmeticException e) {
			e.printStackTrace();
			
		}		
		
		
		System.out.println("Arthimatic ends................");
	}
	
	
	
	public void Arryindex() {
		
		// if you are trying to print more then arry size you will get ArrayindexoutofBounds exception
		
		System.out.println("Arryindex exception start");
		
		try {
		int arry[]=new int[4];
		
		arry[0]=10;
		arry[1]=20;
		arry[2]=30;
		arry[3]=40;
		
		
		System.out.println(arry[0]);
		System.out.println(arry[1]);
		System.out.println(arry[2]);
		System.out.println(arry[3]);
		System.out.println(arry[4]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Arryindex exception ends");
		
	}
	
	public void nullpointer() {
		
		// if you are trying to add null to number you will get nullpointer exception
		try {
		System.out.println("null pointer exception start.........");
	
		Integer i=null;
		int j=20;
		int k=i+j;
		
		System.out.println(k);
		
		}catch (NullPointerException e) {
			e.printStackTrace();
			
		}
		
		
		System.out.println("null pointer exception ends.........");
	}
	
	public void numberFormat() {
		
		//if you are trying to add integer to string  value you will get numberformat exception
		
		System.out.println("number format Exception start");
		try {
		String s="123abc";
		Integer val=Integer.valueOf(s);
		
		System.out.println(val);
		}catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
	
		System.out.println("number format Exception end");
	}
	
	
	public void Interrupted() {
		
		// compaltime exception
		
		System.out.println("Interrupted exception start....");
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				
			Thread.sleep(2000);;
				}catch (Exception e) {
					
					e.printStackTrace();
				}
					
			
			
		}
		
		
		System.out.println("Interrupted exception ends....");
	}
	
	public void Interrupted2() throws InterruptedException {
		
		for(int i=0; i<5;i++) {
			System.out.println(i);
			
			Thread.sleep(5000);
			
			
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException {
	
		ExceptionTest1 et=new ExceptionTest1();
		
		//et.Arthimatic();
		
		//et.Arryindex();
		
		//et.nullpointer();
		
		//et.numberFormat();
		
		//et.Interrupted();
		
		et.Interrupted2();
		
	}
}

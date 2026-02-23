package collect;

public class ArrayTest {
	
	// to store the multiple values in same type data
	public static void main(String[] args) {
		
		int arr[]=new int[4];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		// 1 type of iteration
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);	
		}
		
		System.out.println("2nd type iteration======================= ");
		// for each
		for(int val:arr) {
			
			System.out.println(val);
			
		}
	}

}

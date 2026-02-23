package logical;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,4,2,5,7,9,3,10);
	Integer max=list.stream().mapToInt(x->x).max().getAsInt();
		Integer min=list.stream().mapToInt(x->x).min().getAsInt();
		
		System.out.println("max::"+max+" "+"min::"+min);
		
	}

}

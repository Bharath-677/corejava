package variables;

public class VariablesTest2 {
int id=10;  //instant variable
	
	public int xyz() {
		int id=20;    //Local variables
		  this.id=30;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println();
		System.out.println();
		return 0;
	}
	
	public static void main(String[] args) {
		VariablesTest2 vt2= new VariablesTest2();
		vt2.xyz();
		
		
		
	}

}

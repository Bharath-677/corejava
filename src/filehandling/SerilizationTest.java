package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationTest {
	
	public static void main(String[] args) throws IOException {
		customer c1=new customer(101, "bharath", 12345L, 1233);
		
		System.out.println(c1);
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ashok\\OneDrive\\Desktop\\Bharath pathuri\\test.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);  // written code converts into byte code
		
		oos.writeObject(c1);  // writing object
		oos.close();
		fos.close();
		System.out.println("serilization Done..................");
		
		}
	

}

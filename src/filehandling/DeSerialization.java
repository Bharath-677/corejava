package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\ashok\\\\OneDrive\\\\Desktop\\\\Bharath pathuri\\\\test.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object obj=ois.readObject();
		
		customer c=(customer)obj;
		
		System.out.println(c);
		
		ois.close();
		fis.close();
		
	}

}

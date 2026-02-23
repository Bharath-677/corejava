package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	
	public static void main1(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\ashok\\OneDrive\\Desktop\\Bharath pathuri\\test.txt");
		
		FileWriter fw=new FileWriter(file);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		// here we can pass file path location - to write the content
		
		bw.write("Teja IT");
		bw.newLine();
		bw.write("Your Java Stop!");
		bw.newLine();
		bw.write("Hyderabad");
		bw.close();
		fw.close();
		
		
	}
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\ashok\\OneDrive\\Desktop\\Bharath pathuri\\test.txt");
	
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	
	
	String line=br.readLine();
	
	while(line!=null) {
		
		System.out.println(line);
		line=br.readLine();
		
	}
	br.close();
	fr.close();
	
	
}
}

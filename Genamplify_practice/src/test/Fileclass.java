package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileclass {

	public static void main(String[] args) throws IOException {
		 
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Genamplify_practice\\data\\test data");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bfw = new BufferedWriter(fw);
		
		String data = "Here Am Writing here file code";
		bfw.write(data);
		bfw.close();
		
		

	}

}

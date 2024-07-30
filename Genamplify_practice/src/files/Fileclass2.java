package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileclass2 {

	public static void main(String[] args) throws IOException {
		 
		 File f1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Genamplify_practice\\data\\test data");
		 
		 FileWriter flw = new FileWriter(f1);
		 BufferedWriter buf = new BufferedWriter(flw);
		 
		 String data = "hai this is megavath rajesh ";
		 buf.write(data);
		 buf.close();

	}

}

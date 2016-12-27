package Chapter14;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritingToFile {
	
	public static void main(String[] args)
	{
		try {
			FileWriter fis = new FileWriter("/Users/deekshithmayanna/Desktop/file1.txt");
BufferedWriter writer = new BufferedWriter(fis);
writer.write("sd dsf dfs vcx sdf dsfsd f dsfs");
// writer.flush();
writer.close();
fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

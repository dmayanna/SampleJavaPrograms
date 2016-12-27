package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
	
	public static void main(String[] args)
	{
		
		try {
			FileReader fr = new FileReader("/Users/deekshithmayanna/Desktop/file1.txt");
			BufferedReader reader = new BufferedReader(fr);
			String line = null;
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

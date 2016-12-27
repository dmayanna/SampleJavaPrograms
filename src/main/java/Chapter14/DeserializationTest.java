package Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String[] args)
	{
		try {
			FileInputStream fis = new FileInputStream("/Users/deekshithmayanna/Desktop/file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object one = ois.readObject();
			Object two = ois.readObject();

			Cat c1 = (Cat) one ;
			Dog d1 = (Dog) two ;
			d1.makeNoise();
			c1.makeNoise();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

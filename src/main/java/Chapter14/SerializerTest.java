package Chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializerTest {
	
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Dog d = new Dog();
		try {
			FileOutputStream fo = new FileOutputStream("/Users/deekshithmayanna/Desktop/file.txt");
			ObjectOutputStream ob = new ObjectOutputStream(fo);
			ob.writeObject(c);

			ob.writeObject(d);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

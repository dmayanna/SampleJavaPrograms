package Chapter14;

import java.io.Serializable;

public class Cat implements Serializable{
	
	int weight =8;
	int height =7;
	String name = "Fido";
	public void makeNoise()
	{
		System.out.println("Meow meow");
	}

}

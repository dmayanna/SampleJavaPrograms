package Chapter14;

import java.io.Serializable;

public class Dog implements Serializable {

	int weight =100;
	String name = "casper";
	 Cat cat = new Cat();
	
	public void makeNoise()
	{
		System.out.println("Bow Bow");
	}
}

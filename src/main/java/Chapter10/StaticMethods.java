package Chapter10;

public class StaticMethods {
	
	static int count =0;
	
	public static void Dog()
	{
		System.out.println("I am a Dog");
		count++;
	}
	
	public static void cat()
	{
		System.out.println("I am a cat");
		count++;
	}
	
	public void lion()
	{
		System.out.println("I am a lion");
		cat();
		count++;
	}

}

package chapter7;

public abstract class Animal {

	String picture;
	String food = "Biryani";
	String hunger;
	int boundaries;
	String location;
	
	public void makeNoise()
	{
		System.out.println("generic animal noise ");
	}
	public void eat()
	{
		System.out.println("Generic animal eating");
	}
	
	public void sleep()
	{
		System.out.println("Generic animal sleeping");
	}
	
	public void roam()
	{
		System.out.println("Generic animal roaming");
	}
	
	private void food()
	{
		System.out.println(food);
	}
 
}

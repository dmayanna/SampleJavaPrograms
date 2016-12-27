package chapter7;

public class Cat extends Feline implements Pets{
	
	public void makeNoise()
	{
		System.out.println("Cat making noise");
	}
	
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	
	public void beFriendly() {
	     
		 System.out.println("I am a cat and I am frindly");
	}

	public void fetchBall() {
		// TODO Auto-generated method stub
		 System.out.println("I am a cat and I am fetching the ball");	
		
	}

}

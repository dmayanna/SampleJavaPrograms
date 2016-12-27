package chapter7;

public class Dog extends Canine implements Pets {

	public void makeNoise()
	{
		System.out.println("Dog is making Noise");
	}
	
	public void eat()
	{
		System.out.println(" Dog is eating ");
	}

	public void beFriendly() {
     
		 System.out.println("I am a Dog and I am frindly");
	}

	public void fetchBall() {
		// TODO Auto-generated method stub
		 System.out.println("I am a Dog and I am fetching the ball");	
		
	}
}

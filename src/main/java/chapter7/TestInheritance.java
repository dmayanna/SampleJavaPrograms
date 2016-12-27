package chapter7;

public class TestInheritance {

	public static void main(String[] args)
	{
		Wolf casper = new Wolf();
		casper.makeNoise();
		casper.roam();
		casper.eat();
		casper.sleep();
		Animal wolf = new Wolf();
		wolf.eat();
		wolf.makeNoise();
		wolf.sleep();
		casper.fart();
		casper.food="deer";
		wolf.food="jinke";
		casper.food();
		
		Pets doggy = new Dog();
		doggy.beFriendly();
		
		Pets catty = new Cat();
		catty.beFriendly();
		
		Pets robo = new Robot();
		robo.beFriendly();
		
		
	}
}
 
package chapter2;

public class MathOperationstest {
	
	public static void main(String[] args)
	{
		Addition add = new Addition();
		System.out.println("hi this is Deekshith "+add.add(2, 3));
		
		Subtraction sub = new Subtraction();
		System.out.println(sub.sub(5, 3));
		
		Multiply mul = new Multiply();
		System.out.println(mul.mul(5, 8));
		
	}

}

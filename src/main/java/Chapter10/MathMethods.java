package Chapter10;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class MathMethods {
	
	public static void main(String[] args)
	{
		// generate a random number between 1-5 
		System.out.println("Returning 5 random numbers");
		for(int i=0; i<5;i++)
		{
			int k=(int) (Math.random()*5);
			System.out.println(k);
	    }
		
		// demonstrating abs value of a number 
		int j = (int) Math.round(Math.abs(-345.945));
		System.out.println(j);
		
		System.out.println(Math.abs(-345.345));
		
		System.out.println(Math.min(78, 545));
		
		System.out.println(Math.multiplyExact(3, 5));
		
		int h=6;
		Locale chn = Locale.CHINA;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(chn);
		String money = formatter.format(h);
		System.out.println(money);
		
		
	}

}

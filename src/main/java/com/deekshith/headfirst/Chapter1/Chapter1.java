package com.deekshith.headfirst.Chapter1;

public class Chapter1
{
public static void main(String[] args)
{
	int i;

	for( i=0;i<100;i++)
	{
		while(i%2 !=0)
		{
			System.out.println("this number is odd "+i);
			break;
			
		}
		
		if(i%2 == 0)
		{
			System.out.println("This number is even "+i);
		}
		else
		{
			System.out.println("The number is odd "+i );
		}
	}
	
	
}
	
}
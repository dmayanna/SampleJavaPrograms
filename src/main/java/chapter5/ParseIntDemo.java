package chapter5;

import java.util.Scanner;

public class ParseIntDemo {
	
	public void NumSeries()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the end point of series");
	int num = Integer.parseInt(scan.next());
	for(int i=1;i<=num;i++)
	{
		System.out.println(i);
	}
	}

}

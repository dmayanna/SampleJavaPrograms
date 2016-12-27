package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	
	public ArrayList<String> NamesList()
	{
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 5 names and press enter after you enter the name");
		for(int i=0;i<5;i++)
		{
			String name = scan.next();
			list.add(name);
			
		}
		return list;
		
	}

}

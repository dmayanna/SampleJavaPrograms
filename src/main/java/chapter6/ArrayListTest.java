package chapter6;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args)
	{
		ArrayListDemo demo = new ArrayListDemo();
		ArrayList<String> arr = demo.NamesList();
		System.out.println("The names you have entered are");
		for(String name:arr)
		{
			System.out.println(name);
		}
		System.out.println(arr.size());
		arr.remove(1);
		System.out.println(arr);
		
	}

}

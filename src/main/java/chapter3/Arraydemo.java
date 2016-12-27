package chapter3;

public class Arraydemo {
	
	public int[] takevalues(int a,int b,int c,int d)
	{
		int[] arr = {a,b,c,d};
		
		return arr;
		
	}
	
	public Dog[] dogsender()
	{
		Dog dog = new Dog();
		Dog dog1= new Dog();
		Dog dog2 = new Dog();
		Dog[] dogarray = new Dog[3];
		
		dogarray[0]=dog;
		dogarray[1]=dog1;
		dogarray[2]=dog2;
		
		
		return dogarray;
		
	}

} 

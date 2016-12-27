package chapter4;

public class Dog {
	
	private int size;
	private String name;
	
	public int getSize()
	{
		return size;
		
	}
	public void setSize(int s)
	{   
		if(s>0)
		{
		this.size=s;
		}
		else
		{
			this.size=1;
		}
	}
	
	public void setName(String n)
	{
		this.name= n;
	}
	
	public void makeaDog()
	{
		System.out.println("The Dog you created is "+name+" and its size is "+size);
	}
	
	

}

	
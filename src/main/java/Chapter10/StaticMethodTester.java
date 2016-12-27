package Chapter10;


public class StaticMethodTester {
	static int size=89;
	public static void main(String[] args)
	{
		StaticMethods meth = new StaticMethods();
		meth.lion();
		StaticMethods.cat();
		StaticMethods.Dog();
		StaticMethods stat = new StaticMethods();
		stat.lion();
		System.out.println("The size is "+size);
		System.out.println(stat.count);
		
		LoadingPrimitiveInArraylist LoadingPrimitiveInArraylist = new LoadingPrimitiveInArraylist();
		LoadingPrimitiveInArraylist.primitiveValuesInArraylist();	
	}

}

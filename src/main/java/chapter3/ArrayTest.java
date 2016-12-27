package chapter3;

public class ArrayTest {
	public static void main(String[] args) {

		Arraydemo demo = new Arraydemo();
		int arr[] = new int[4]; 
		arr=demo.takevalues(2, 3, 4,5);
		
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		Dog[] dogarr = demo.dogsender();
		dogarr[0].Bark(1);
		dogarr[1].Bark(2);
		dogarr[2].Bark(3);
	}

}

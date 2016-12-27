package Chapter10;

import java.util.ArrayList;

public class LoadingPrimitiveInArraylist {
	public void primitiveValuesInArraylist(){
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
	// converting a primitive value into a object using wrapper Integer class
	Integer int1= new Integer(100);
	Integer int2= new Integer(1);
	Integer int3= new Integer(1);
	
	// array lists always takes objects and not primitives
	alist.add(int1);
	alist.add(int2);
	alist.add(int3);
	System.out.println(alist);
	
	// unwrapping the Integer object to get the int value 
	int unwrappedvalue = int1.intValue();
	System.out.println(unwrappedvalue);
	String binaryvalue = Integer.toBinaryString(20000);
	System.out.println(binaryvalue );
	
	}
}

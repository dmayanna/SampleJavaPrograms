package StringOperations;

import java.util.Locale;

public class StringOperations {
	
	public static void main(String[] args)
	{
		// Demo of char charAt(int index): It returns the character at the specified index.
		String s1 = "This is a is a is String ";
		String s2 ="This is a String too";
		System.out.println(s1.charAt(8));
		
		// int codePointAt(int index):It is similar to the charAt method however it returns the Unicode code point value of specified index rather than the character itself.
		System.out.println(s1.codePointAt(8));
		
		//void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin): It copies the characters of src array to the dest array. Only the specified range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).
		char[] t = new char[8];
		s1.getChars(0, 8, t, 0);
		System.out.println(t);
		
		//boolean equals(Object obj): Compares the string with the specified string and returns true if both matches else false.
		System.out.println(s1.equals(s1));
		
		//boolean contentEquals(StringBuffer sb): It compares the string to the specified string buffer.
		StringBuffer sb = new StringBuffer();
		sb.append("hey Baby");
		sb.append(",how are you doing ? ");
		System.out.println(sb);
		System.out.println(s1.contentEquals(sb));
	
		// StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("derek is a nice guy ");
		System.out.println(builder);
		
		builder.append(sb);
		System.out.println(builder);
				
		//boolean equalsIgnoreCase(String string): It works same as equals method but it doesn’t consider the case while comparing strings. It does a case insensitive comparison.
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//int compareTo(String string): This method compares the two strings based on the Unicode value of each character in the strings.
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s1));
		
		System.out.println("Deekshith".compareTo("deekshith"));
		
		System.out.println("Deekshith".compareToIgnoreCase("deekshith"));
		
		System.out.println(s1.regionMatches(0, s2, 0, 19));
		
		// boolean startsWith(String prefix, int offset): It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
		System.out.println(s1.startsWith(s2));
		
		// boolean endsWith(String suffix): Checks whether the string ends with the specified suffix.
		System.out.println(s1.endsWith("String "));
		
		//int hashCode(): It returns the hash code of the string.
		System.out.println(s1.hashCode());
		
		// int indexOf(int ch):
		
		System.out.println(s1.indexOf("S"));
		
		//int indexOf(int ch, int fromIndex): Same as indexOf method however it starts searching in the string from the specified fromIndex.
		System.out.println(s1.indexOf("S",4));
		
		//int lastIndexOf(int ch): It returns the last occurrence of the character ch in the string.
		System.out.println(s1.lastIndexOf("i"));
		
		//int indexOf(String str): This method returns the index of first occurrence of specified substring str.
		System.out.println(s1.indexOf("i"));
		
		//String substring(int beginIndex): It returns the substring of the string. The substring starts with the character at the specified index.
		System.out.println(s1.substring(6));
		
		//String substring(int beginIndex, int endIndex): Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
		System.out.println(s1.substring(2,5));
		
		System.out.println(s1.concat(s2));
		
		//String replace(char oldChar, char newChar): It returns the new updated string after changing all the occurrences of oldChar with the newChar.
		System.out.println(s1.replace("This", "that"));
		
		//boolean contains(CharSequence s): It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.
	
		System.out.println(s1.contains("is"));
		
		//String replaceFirst(String regex, String replacement): It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
		
		System.out.println( s1.replaceFirst("is", "is a"));
		
		//String replaceAll(String regex, String replacement): It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.
		System.out.println(s1.replaceAll("is"," Ha ha ha "));
		
		System.out.println("-----------------------------");
		
		 String str = new String("28/12/2013/67/88");
	       System.out.println("split(String regex):");
	       String array1[]= str.split("/");
	       for (String temp: array1){
	          System.out.println(temp);
	       }
	       System.out.println("split(String regex, int limit) with limit=2:");
	       String array2[]= str.split("/", 2);
	       for (String temp: array2){
	          System.out.println(temp);
	       }
	       System.out.println("split(String regex, int limit) with limit=0:");
	       String array3[]= str.split("/", 0);
	       for (String temp: array3){
	          System.out.println(temp);
	       }
	       System.out.println("split(String regex, int limit) with limit=4:");
	       String array4[]= str.split("/", 4);
	       for (String temp: array4){
	          System.out.println(temp);
	       }
	       
	       //String toLowerCase(Locale locale): It converts the string to lower case string using the rules defined by given locale.
	       
	       String str1 = new String("ABC IS NOT EQUAL TO XYZ");
	       //Standard method of conversion
	       System.out.println(str1.toLowerCase());

	       //By specifying Locale
	       System.out.println(str1.toLowerCase(Locale.CHINESE));
	       
	       
	       String str11 = new String("this is a test string");
	       //Standard method of conversion
	       System.out.println(str11.toUpperCase());

	       //By specifying Locale
	       System.out.println(str11.toUpperCase(Locale.CHINA));
	       
	       //String trim(): Returns the substring after omitting leading and trailing white spaces from the original string.
	       System.out.println(s1.trim());
	       
	       //char[] toCharArray(): Converts the string to a character array.
	       char[] s11=null;
	       s11= s1.toCharArray();
	       
	       for(char c: s11)
	       {
	    	   System.out.println(c);
	       }
	       
	       //static String copyValueOf(char[] data): It returns a string that contains the characters of the specified character array.
	       String sq ="";
	       System.out.println(" SQ is : "+sq.copyValueOf(s11));
	               
	       
	       //static String copyValueOf(char[] data, int offset, int count): Same as above method with two extra arguments – initial offset of subarray and length of subarray.
	       System.out.println(" SQ is : "+sq.copyValueOf(s11,0,5));

	       //byte[] getBytes(String charsetName): 
	       byte[] b1 = s1.getBytes();
	       
	       for(byte by: b1)
	       {
	    	   System.out.println(by);
	       }
	       
	       //int length(): It returns the length of a String.
	       System.out.println("The length is : "+s1.length());
	       
	       
	     

		}
	
	

	
}

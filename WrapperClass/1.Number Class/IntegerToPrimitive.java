import java.util.*;

/*Q2. Write a java program to Convert an Integer object into a primitive int.
Explanation :- 
Extracting primitive value from wrapper object is called unboxing.

Input :- Integer num = 50
Output :- 50
*/

public class IntegerToPrimitive
{
	public static void main(String args[])
	{
		Integer obj=12;
		int a=(int)obj;
		System.out.println(a);
		
	}
}
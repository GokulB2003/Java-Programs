import java.util.*;
/*Q1.Write a Java program to convert a primitive int value into an Integer object using wrapper class.
Explanation :- 
Java provides wrapper classes to convert primitive data types into objects. This is called boxing.

Input :- int num = 25
Output :- 25

*/
public class Boxing
{
	public static void main(String args[])
	{
		int num=25;
		Integer i=num;
		System.out.println(i);
	}
}
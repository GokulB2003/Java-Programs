/*Arrays in java
Q1. Write a java program to take input from array of size 5 and display it.
*/
import java.util.*;
public class Array
{	static int b[];
	public static void main(String args[])
	{
		System.out.println(b);

		System.out.println("Enter the values in the array");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display the value of Array");
		for(int i=0; i<a.length;i++)
		{
			System.out.println("values of array in index of"+i+":"+a[i]);
		}
		//length of the Array:
		System.out.println("The size of the Array"+a.length);
		System.out.print("the base address is:"+a);
		System.out.printf("%d",a[0],0*4);
	}
}
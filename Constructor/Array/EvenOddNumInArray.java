/* Write a java program to find positive and negative number in array.
*/
import java.util.*;
public class EvenOddNumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Even number");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");	
			}
		}
		System.out.println();
		System.out.println("Odd numbers:");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		

	}
}
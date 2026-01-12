/*Q13. Write a java program to copy one array to another array*/
import java.util.*;
public class CopyOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		//System.out.println("Enter the value of n:");
		//int n=sc.nextInt();
		System.out.println("Enter the values in Array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=0;
		int arr2[]=new int[arr.length];
		for(int i=0; i<arr2.length; i++)
		{
			arr2[k]=arr[i];
			k++;
		}
		System.out.println("Display the values:");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
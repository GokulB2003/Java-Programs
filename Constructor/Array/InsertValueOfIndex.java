/*
WAP to insert value on specified index in array and shift value to next index 
input:[1,2,3,5,9,10];
insert element :45
index:3
output:[1,2,3,45,5,9,10]
*/
import java.util.*;
public class InsertValueOfIndex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in the Array:");
		int arr[]=new int[5];
		System.out.println("Enter the index to insert:");
		int j=sc.nextInt();
		System.out.println("Enter the element:");
		int e=sc.nextInt();

		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-2; i>=j; i--)
		{
			arr[i+1]=arr[i];

		}
		arr[j]=e;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
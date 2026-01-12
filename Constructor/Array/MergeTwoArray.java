/*Q9. Write java program to merge two array and display it.
*/
import java.util.*;
public class MergeTwoArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter the size of the 2nd array");
		size=sc.nextInt();
		int arr2[]=new int[size];

		System.out.println("Enter the elements in 1st array:");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Elements in 2nd Array");
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i]=sc.nextInt();
		}
		int arr3[]=new int[arr1.length+arr2.length];
		int j=0;
		for(int i=0; i<arr1.length; i++)
		{
			arr3[j]=arr1[i];
			j++;
		}
		int k=arr1.length;
		for(j=0; j<arr2.length; j++)
		{
			
			arr3[k]=arr2[j];
			k++;
		}
		System.out.println("Display value");
		for(int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		
	}
}
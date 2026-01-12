/*Q16. Write a java program to find second highest value of array.
Input : 10 40 50 
Output : 40
*/
import java.util.*;
public class SecondHighestInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("ENter the value in array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();

		}
		int maxi=0;
		int smax=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>maxi)
			{
				smax=maxi;//10
				maxi=arr[i]; 
												
			}
			
	
		}
		System.out.println("Second Last:"+smax);
	}
}
/* Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array


*/
import java.util.*;
public class MajorityEle{
	public static void main(String args[])
	{
	int arr[]={4,8,4,6,7,4,4,8};
	
		int count=1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max=1,ans=0;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;	
				
			}
			else
			{
				count=1;
			}
			if(count>max)
				{
					max=count;
					ans=arr[i];
					
			        }	
		}
		if(max>(arr.length/2))
			{	
				System.out.println(ans);
			}
			else
			{
				System.out.println("There is no Majority Element:");
			}	
		
			}
}
/* Q.8 Write a Java program to find the maximum sum of any contiguous subarray of size k from a 
given array. 
Concept tested: Fixed-size sliding window for subarray sums. 
  
 Input: arr = [2, 1, 5, 1, 3, 2], k = 3 
 Output: 9 
 Explanation: Subarray [5,1,3] has the maximum sum = 9*/


import java.util.*;
public class Q8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//used for takes input Scanner class

		System.out.println("ENter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];  //initialize the array
		System.out.println("ENter the element");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int maxi=0,sum=0;

		for(int i=0;i<k; i++)			//cal first k element sum;
		{
			sum+=arr[i];
			maxi=sum;
		}
		for(int i=k; i<arr.length; i++)		//move slide for other elements
		{
			sum+=arr[i]-arr[i-k];
			if(sum>maxi)
			{
				maxi=sum;
			}
		}
		System.out.println("maximum sum is:"+maxi);		//print the maximum element
		
	}
}
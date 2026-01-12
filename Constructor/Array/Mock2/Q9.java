/*
Q9. Write a Java program to find the maximum of all subarrays of size k. 
 
  Example: 
    Input: arr = [1,3,-1,-3,5,3,6,7], k = 3 
    Output: [3,3,5,5,6,7] 
    Explanation: Each window gives a maximum →  
    [1,3,-1] → 3   
    [3,-1,-3] → 3   
    [-1,-3,5] → 5   
    [-3,5,3] → 5   
    [5,3,6] → 6   
    [3,6,7] → 7
*/
import java.util.*;
public class Q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//used for takes input Scanner class

		System.out.println("ENter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];  //initialize the array
		System.out.println("ENter the element");
		int maxi=Integer.MIN_VALUE;
		for(int i=0; i<arr.length-2; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]>arr[j] && arr[i]>arr[k])
					{
						System.out.print(arr[i]+" ");
					}
					else if(arr[j]>k && arr[j]>arr[i])
					{
						System.out.print(arr[j]+" ");
					}
					else
					{	System.out.print(arr[k]+" ");
					}


					
				}
			}
		}
		
		
	}
}
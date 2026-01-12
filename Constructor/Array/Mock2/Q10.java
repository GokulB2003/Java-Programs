/*Q.10 Write a Java program to find all unique triplets in the array whose sum is zero using the two 
pointer technique. 
 
  Example: 
   Input: arr = [-1, 0, 1, 2, -1, -4]   
   Output: [[-1, -1, 2], [-1, 0, 1]]
*/

import java.util.*;
public class Q10
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
		for(int i=0; i<arr.length-2; i++)
		{	int sum=0;
			for(int j=i+1; j<arr.length-1; j++)	//used for iterate the array
			{
				for(int k=j+1; k<arr.length; k++)
				{	
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
						//System.out.print(",");				
					}	
				}						//arr = [-1, 0, 1, 2, -1, -4]  
			}
		}
	}
}
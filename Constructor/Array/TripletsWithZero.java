/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class TripletsWithZero 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length-2; i++)
		{	
			for(int j=i+1; j<arr.length-1; j++)
			{	
				for(int b=j+1; b<arr.length; b++)
				{	
					
					if((arr[i]+arr[j]+arr[b])==0)
					{
						
						System.out.println(arr[i]+","+arr[j]+","+arr[b]);
					}
				} 

			}
						
				
		}
	}
}
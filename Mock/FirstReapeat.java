/*Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
Explanation:
Use a boolean array or nested loops to track seen elements.
Expected Output:
First repeating element is 5

*/
import java.util.*;
public class FirstReapeat
{
	public static void main(String args[])
	{
		int arr[]={10,5,3,4,3,5,6};
		Boolean flag=true;
		int ans=0;
		for(int i=1; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j]  && i!=j && flag==true)
				{
					flag=false;
					 ans=arr[j];
					break;
				}
				
			}
			
		}
		System.out.println(ans);

		
	}
}
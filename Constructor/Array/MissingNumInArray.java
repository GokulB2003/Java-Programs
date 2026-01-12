
/*5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.*;
public class MissingNumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
					//Scanner sc=new Scanner(System.in);
			int arr[]={1,2,5};
			int count=1;
			
			for(int i=1; i<arr.length; i++)
			{
				if(arr[i]==arr[i-1])
				{
					continue;
				}
				else
				{	
					int k=arr[i-1]+1;
	
					while(k<arr[i])
					{
						System.out.print(k+" ");
						k++;
					}
						
				}
			}
						
			
	
		
	}
}
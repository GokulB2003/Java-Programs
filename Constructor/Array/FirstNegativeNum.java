/*Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.
Input: arr[] = [-8, 2, 3, -6, 1] , k = 2
Output: [-8, 0, -6, -6]
*/
import java.util.*;
public class FirstNegativeNum
{
	public static void main(String args[])
	{
		int arr[]={-8,2,3,-6,1};

		int sum=0,k=2;
		for(int i=0; i<k; i++)
		{	sum+=arr[i];	
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
				break;
			}

		}
		for(int i=k; i<arr.length; i++)
		{
			sum+=arr[i];
			int p=i-k;
			while(p<=i)
			{
				if(arr[p]<0)
				{
					System.out.print(arr[p]+" ");
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.print(0);
			}
			sum=sum-arr[i-k];	
			
		}

		
		
	}
	
}
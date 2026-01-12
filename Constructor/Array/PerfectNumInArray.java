/*Q20. Write a java program to find perfect number of a array.
*/
import java.util.*;
public class PerfectNumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length; i++)
		{
			int p=arr[i];
			int sum=0;
			for(int j=1; j<=p/2; j++)//2
			{	if(arr[i]%j==0)
				{
					sum+=j;
				}
				
			}
			if(sum==p)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
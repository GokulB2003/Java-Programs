/*Maximum sum subarray of array window size*/
import java.util.*;
public class MaxiSumSubArraySliding
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,4,2,10,2,3,1,0,20};
		int sum=0,maxi=0;
		int k=4;
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];
			maxi=sum;
			
		}
		int a=0,b=0,c=0,d=0;
		for(int i=k; i<arr.length; i++)
		{
			sum=sum-arr[k];
			sum+=arr[i];
			if(sum>maxi)
			{
				maxi=sum;
				a=arr[i-k];
				b=arr[i-(k-1)];
				c=arr[i-(k-2)];
				d=arr[i-(k-3)];
				
			}
		}
		System.out.println("["+a+","+b+","+c+","+d+"]");
		System.out.println(maxi);
	}
}
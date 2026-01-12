import java.util.*;
public class MaxSumSubarr
{
	public static void main(String args[])
{
	int arr[]={1,1,1,1,1};
	int max=0,sum=0,first=0,last=0;
	/*for(int i=0; i<arr.length; i++)
	{
		 sum=0;
		for(int j=i; j<arr.length; j++)
		{
			sum+=arr[j];
			if(sum>max)
			{
				max=sum;
				first=i;
				last=j;	
			}	
		}
		
	}*/



	//or
	int l=0,start=0;
	while(start<arr.length-1)
	{
		sum+=arr[l];
		if(sum>max)
		{
			max=sum;
			first=start;
			last=l;
			
		}
		
		if(l==arr.length-1)
		{
			sum=0;
			start++;
			l=start;
		}
		l++;
		
	}
	
	System.out.println("maximum sum of the subarray is:"+max);
	for(int i=first; i<=last; i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
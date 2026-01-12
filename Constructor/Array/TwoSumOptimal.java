//two SUM
import java.util.*;
public class TwoSumOptimal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,6};
		int l=0,r=arr.length-1,target=6,sum=0;
		Boolean flag=false;
		while(l<r)
		{	
			
			if(arr[l]+arr[r]==target)
			{
				System.out.println(l+","+r);
				flag=true;
				break;
			}
			else if(arr[l]+arr[r]<target)
			{
				l++;
				
			}
			else if(arr[l]+arr[r]>target)
			{
				r--;
			}
			
			
		}
		if(!flag)
			{
				System.out.println("Element not found:");
			}
	}
}
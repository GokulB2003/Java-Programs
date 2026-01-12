/*10. Minimum Size Subarray with Sum ≥ Target

Approach: Sliding Window
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
import java.util.*;
public class MinimumSizeSubarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={2,3,1,2,4,3};
		int target=7;
		int l=0,r=0,sum=0,length=0,i=0,j=0;
		int maxi=Integer.MAX_VALUE;
		while(r<arr.length)
		{
			sum+=arr[r];
			while(sum>=target)
			{	
				length=r-l+1;
				if(maxi>length)
				{
					maxi=length;
					i=l;
					j=r;
					
				}
				sum=sum-arr[l];
				l++;
			}
			r++;
		}
		System.out.print("the minimum size of subarray is:"+maxi+"\n");
		System.out.println("[");
		while(i<=j)
		{
			System.out.print(arr[i]+",");
			i++;
		}
		System.out.println("]");
	}
}
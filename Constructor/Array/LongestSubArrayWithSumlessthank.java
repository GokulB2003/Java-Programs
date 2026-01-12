/*8. Longest Subarray with Sum ≤ K

Approach: Sliding Window
Example: arr = [1,2,1,0,1,1,0], k = 4 → Length: 5
*/
import java.util.*;
public class LongestSubArrayWithSumlessthank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,1,0,1,1,0};
		int k=4,l=0,r=0,i=0,j=0,mini=Integer.MIN_VALUE,sum=0,le=0;
		while(r<arr.length)
		{
			sum+=arr[r];
			if(sum<=k)
			{
				le=r-l+1;
				if(le>mini)
				{	
					i=l;
					j=r;
					mini=le;
				}	
			}
			if(sum>k)
			{
				sum=sum-arr[l];
				l++;
			}
			r++;
		}
		System.out.print("Longest Subarray length is:"+mini+"\n");
		System.out.println("the window is:"+"[");
		while(i<=j)
		{
			System.out.print(arr[i]+",");
			i++;
		}
		
	}
}
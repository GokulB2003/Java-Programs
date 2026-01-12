import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>ans=new ArrayList<>();
        double sum=0.0f;
        for(int i=0; i<nums1.length; i++)
        {
            ans.add(nums1[i]);

        }
        for(int i=0; i<nums2.length; i++)
        {
            ans.add(nums2[i]);
        }
        Collections.sort(ans);
        if(ans.size()%2!=0)
        {
            int mid=ans.size()/2;
           return (double)ans.get(mid);
        }
        else
        {
            int mid=ans.size()/2;
		
             sum= ((double)(ans.get(mid))+(double)(ans.get(mid-1)))/2;
	
        }
        return sum;
        
    }
}
public class FindMedianValueOfArr
{
	public static void main(String args[])
	{
		int num1[]={1,2};
		int num2[]={3,4};
		Solution s=new Solution();
		double ans=s.findMedianSortedArrays(num1,num2);
		System.out.println(ans);
	}
}
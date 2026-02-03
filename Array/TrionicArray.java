/*ou are given an integer array nums of length n.

An array is trionic if there exist indices 0 < p < q < n − 1 such that:

nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.

Input: nums = [1,3,5,4,2,6]

Output: true

Explanation:

Pick p = 2, q = 4:

nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
nums[4...5] = [2, 6] is strictly increasing (2 < 6).

*/
class Solution {
    public boolean isTrionic(int[] nums) {

        if(nums.length<4)return false;
        int i=0;
        while(i+1<nums.length && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==0)return false;
        int j=i;
        while(i+1<nums.length && nums[i]>nums[i+1])
        {
            i++;
        }
        if(i==j)return false;
        int k=i;
        while(i+1<nums.length && nums[i]<nums[i+1])
        {
            i++;
        }
         // i++;
        if(k==i)return false;

        return i==nums.length-1;
      
       

    }
}
public class TrionicArray
{
	public static void main(String args[])
	{
		int arr[]={1,3,5,4,2,6};
		Solution s=new Solution();
		boolean ans=s.isTrionic(arr);
		System.out.println(ans);
	}
}
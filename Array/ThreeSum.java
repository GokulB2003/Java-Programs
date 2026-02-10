import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int l=0,r=nums.length-1;
        int sum=0;
        for(int i=0; i<nums.length-2; i++)
        {
           if(i>0 && nums[i]==nums[i-1])continue;
          // sum=0;
           l=i+1;
           r=nums.length-1;
            while(l<r)
            {
                sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])l++;
                    while(l<r && nums[r]==nums[r+1])r--;
                }
                else if(sum<0)
                {
                    l++;

                }
                else
                {
                    r--;
                }

            }
        }
        return ans;
        
    }
}
public class ThreeSum
{
	public static void main(String args[])
	{
		int arr[]={-1,0,1,2,-1,-4};
		Solution s=new Solution();
		List<List<Integer>>ans=new ArrayList<>();
		ans=s.threeSum(arr);
		for(int i=0; i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
	}
}
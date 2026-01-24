/*ThirdMax*/
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
      
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        int j=0;
    
        ArrayList<Integer>arr=new ArrayList<>(set);
	if(arr.size()<3)
	{
		return nums[arr.size()-1];
	}
	else
	return arr.get(arr.size()-3);

        
    }
}
public class ThirdMaximum
{
	public static void main(String args[])
	{
		int arr[]={3,2,1};
		Solution s=new Solution();
		//s.thirdMax(arr);
		int ans=s.thirdMax(arr);
		System.out.println(ans);
	}
}
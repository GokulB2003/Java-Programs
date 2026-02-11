/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.*/
import java.util.*;
class Solution {
    public List<Integer>findDisappearedNumbers(int[] nums) {
        
      //  List<Integer>ans=new ArrayList<>();
      //  List<Integer>newAns=new ArrayList<>();
       // Arrays.sort(nums);
        // for(int i=1; i<=nums.length; i++)
        // {
        //     int j=0;
        //     boolean flag=false;
        //     while(j<nums.length)
        //     {
        //         if(nums[j]==i)
        //         {
        //             flag=true;
        //             break;
        //         }
        //         if(nums[j]>i)
        //         {
        //             break;
        //         }
        //         j++;
        //     }
        //     if(flag==false)
        //     {
        //         ans.add(i);
        //     }
        // }
        /*for(int i=0; i<nums.length; i++)
        {
            ans.add(nums[i]);

        }
        for(int i=1; i<=nums.length; i++)
        {
            if(!ans.contains(i))
            {
                newAns.add(i);
            }
        }*/
        LinkedHashMap<Integer,Integer>ans=new LinkedHashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!ans.containsKey(nums[i]))
            {
                ans.put(nums[i],1);
            }
            else
            {
                ans.put(nums[i],ans.get(nums[i])+1);
            }
        }
        List<Integer>newans=new ArrayList<>();
        for(int i=1; i<=nums.length; i++)
        {
            if(!ans.containsKey(i))
            {
                newans.add(i);
            }
        }
        return newans;

    }
}
public class NumbersDisappearedInArray
{
	public static void main(String args[])
	{
		int arr[]={4,3,2,7,8,2,3,1};
		Solution s=new Solution();
		List<Integer>ans=new ArrayList<>();
		ans=s.findDisappearedNumbers(arr);
		for(int i=0; i<ans.size(); i++)
		{
			System.out.println(ans.get(i));
		}
	}
} 
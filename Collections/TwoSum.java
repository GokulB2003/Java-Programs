/*1. Two Sum (LC 1)
Description:
 Find indices of two numbers in an array that add up to a target.
Example:
 Input: [2,7,11,15], target = 9
 Output: [0,1]
Approach (HashMap):
Store number → index in a HashMap
For each element, check if target - num exists
Time: O(n)
 */
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int result=target-nums[i];
            if(map.containsKey(result))
            {
               return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}
public class TwoSum
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int arr[]={2,7,11,15};
        int target=9;
        int ar[]=s.twoSum(arr, target);
        for(int i=0; i<ar.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
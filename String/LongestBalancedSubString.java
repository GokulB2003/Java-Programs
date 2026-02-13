/*ou are given a string s consisting of lowercase English letters.

A substring of s is called balanced if all distinct characters in the substring appear the same number of times.

Return the length of the longest balanced substring of s.

Example 1:

Input: s = "abbac"

Output: 4

Explanation:

The longest balanced substring is "abba" because both distinct characters 'a' and 'b' each appear exactly 2 times.

Example 2:

Input: s = "zzabccy"

Output: 4*/
import java.util.*;


class Solution {
    public static boolean check(int arr[])
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)continue;
            if(count==0)
            {
                count=arr[i];
            }
            if(arr[i]!=count)
            {
                return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxl=0;
        for(int i=0; i<s.length(); i++)
        {
            int arr[]=new int[26];
            for(int j=i; j<s.length(); j++)
            {
                arr[s.charAt(j)-'a']=arr[s.charAt(j)-'a']+1;
                if(check(arr))
                {
                    maxl=Math.max(maxl,j-i+1);
                }

            }
        }
        return maxl;
        
    }
}
public class LongestBalancedSubString
{
	public static void main(String args[])
{
	String s = "abbac";
	Solution s1=new Solution();
	int result=s1.longestBalanced(s);
	System.out.println(result);
}
}
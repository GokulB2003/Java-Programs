/*Longest SubString Without reapeating characters...*/
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int maxl=0;
        LinkedHashSet<Character>ans=new LinkedHashSet<>();
        /*/for(int j=0; j<s.length(); j++)
        {
                if(!ans.contains(s.charAt(j)))
                {
                    ans.add(s.charAt(j));
                }
                else
                {
                    while(ans.contains(s.charAt(i)))
                    {	
                        ans.remove(s.charAt(i));
                        i++;
                    }
			ans.add(s.charAt(j));
                }
		  maxl=Math.max(ans.size(),maxl);
        }*/
		//Or without using the LinkedHashSet brute Force..


		for(int k=0; k<s.length(); k++)
		{
			boolean arr[]=new boolean[256];
			for(int j=k; j<s.length(); j++)
			{
				if(arr[s.charAt(j)])
				{
					break;
				}
				arr[s.charAt(j)]=true;
				maxl=Math.max(maxl,j-k+1);
			}
		}
	
        return maxl;
    }
}
public class LongestSubStringWithoutReapeatingChar
{
	public static void main(String args[])
	{
		Solution s=new Solution();
		String s1="abcabcbb";
		int ans=s.lengthOfLongestSubstring(s1);
		System.out.println(ans);
	}
}
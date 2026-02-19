/**/
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[156];
        int j=0;
        int maxi=0;
        for(int i=0; i<s.length(); i++)
        {
            
            while(arr[s.charAt(i)]>0)             {
                arr[s.charAt(j)]--;
                j++;
            }
            arr[s.charAt(i)]++;
            if((i-j+1)>maxi)
            {
                maxi=(i-j+1);
            }
        }
        return maxi;
        
    }
}
public class LongestSubStringWithoutReapeatingchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s ="abcabcbb";
		Solution obj=new Solution();
		int ans=obj.lengthOfLongestSubstring(s);
		System.out.println(ans);
		
	}
}
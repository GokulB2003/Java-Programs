/*Q25. Two strings are anagrams if they contain same characters with same frequency.
 Input : listen, silent
 Output : Anagram*/

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            int arr[]=new int[256];
            for(int i=0; i<s.length(); i++)
            {
                arr[s.charAt(i)]=arr[s.charAt(i)]+1;
            }
            for(int j=0; j<t.length(); j++)
            {
                arr[t.charAt(j)]=arr[t.charAt(j)]-1;
            }
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]!=0)
                {
                    return false;
                }
            }
                    

            
        }
        return true;
        
    }
}

public class StringAnagram
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2:");
		String str2=sc.nextLine();
		Solution s=new Solution();
		boolean ans=s.isAnagram(str1,str2);
		if(ans)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not An anagram..");
		}		
	}
}
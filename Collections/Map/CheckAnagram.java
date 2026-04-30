import java.util.*;
/*14. Check Anagram Using Map
Problem: Check if two strings are anagrams using frequency logic.
Example:
Input: "listen", "silent"
Output: True */


public class CheckAnagram
{

    public static boolean checkAnagramString(String str1,String str2)
    {
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(char i:str1.toCharArray())
        {
            if(!(map.containsKey(i)))
            {
                    map.put(i,1);
            }
            else
            {
                map.put(i,map.get(i)+1);
            }
        }
        for(char j:str2.toCharArray())
        {
            if(!(map.containsKey(j)))return false;

            if(map.containsKey(j))
            {
                map.put(j,map.get(j)-1);
                if(map.get(j)==0)
                {
                    map.remove(j);
                }
            }
        }
        return map.isEmpty();
    }
   public static void main(String args[])
   {
        String input[]={"listen","silent"};
        for(int i=0; i<input.length; i++)
        {
            for(int j=i+1; j<input.length; j++)
            {
                if(checkAnagramString(input[i],input[j]))
                {
                    System.out.println(input[i]+":"+input[j]);
                }
            }
        }
   }
}
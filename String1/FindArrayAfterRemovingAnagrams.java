/*find resultant Array after removing the Anagrams...*/
import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1; i<words.length; i++)
        {
            if(!isAnagram(ans.get(ans.size()-1),words[i]))
            {
                ans.add(words[i]);
            }
        }
        return ans;
        
    }
    public static boolean isAnagram(String str1,String str2)
    {
        int arr[]=new int[26];
        if(str1.length()!=str2.length())
        {
            return false;
        }
        for(int i=0; i<str1.length(); i++)
        {
            arr[str1.charAt(i)-'a']++;
        
        }
        for(int j=0; j<str2.length(); j++)
        {
            arr[str2.charAt(j)-'a']--;
        }
        for(int i:arr)
        {
            if(i>0)
            {
                return false;
            }
        }
        return true;
    }
  
}
public class FindArrayAfterRemovingAnagrams
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        List<String> ans = sol.removeAnagrams(words);

        System.out.println("Resultant Array: " + ans);

        sc.close();
		
	}
}

class Solution {
    public static boolean palindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0; i<s.length(); i++)
        {
        if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            str+=s.charAt(i);
        }
        }
	
        boolean ans=palindrome(str);
        return ans;
        
    }
}
public class StringPalindrome
{
	public static void main(String args[])
	{	
		Solution s=new Solution();
		String str="";
		boolean ans=s.isPalindrome(str);
		String finalAns=ans?"Palindrome":"non-palindrome";
		System.out.println(finalAns);
	}
}
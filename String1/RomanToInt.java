/*Roman To Integer*/
import java.util.*;
class Solution {
    public static int nums(char ch)
    {
        if(ch=='I')
        return 1;
        else if(ch=='V')
        return 5;
        else if(ch=='X')
        return 10;
        else if(ch=='L')
        return 50;
        else if(ch=='C')
        return 100;
        else if(ch=='D')
        return 500;
        else if(ch=='M')
        return 1000;
        else
        return 0;

    }
    public int romanToInt(String s) {
        int result=0;
        int i=0;
        while(i<s.length()-1)
        {
            if(nums(s.charAt(i))>=nums(s.charAt(i+1)))
            {
                result+=nums(s.charAt(i));
            }
            else if(nums(s.charAt(i))<nums(s.charAt(i+1)))
            {
                int n=nums(s.charAt(i));
                result=result-n;
            }
            i++;
        }
        result+=nums(s.charAt(i));
        return result; 
    }
}
public class RomanToInt
{
	public static void main(String args[])
	{
		Solution s=new Solution();
		String str="MCMXCIV";
		int result=s.romanToInt(str);
		System.out.println("the final result is:"+result);
	}
}
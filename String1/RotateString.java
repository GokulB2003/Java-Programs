import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        int size=s.length();
        String temp="";
       
        temp=s+s;
        if(temp.contains(goal))return true;
        else
        return false;
    }
}
public class RotateString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="abcde;
		String goal="cdeab";
		Solution s=new Solution();

		boolean result=s.rotateString(str,goal);
		if(result)System.out.println("true");
		else
		{
			System.out.println("false");
		}
	}
}
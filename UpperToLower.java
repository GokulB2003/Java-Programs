import java.util.*;
public class UpperToLower
{
	public static void main(String args[])
	{
		String s="RAHUL";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				char c=s.charAt(i);
				s+=(char)c-32;
			}
			else
			{
				s+=s.charAt(i);
				
			}
		}
		System.out.println(s);
	}
}
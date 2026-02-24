/*Q8. Write a java program to find the first repeating word in a sentence. 
Input 
Sentence: "this is a test this is simple" 
Output 
First Repeating Word: this 
Description : 
Manually extract words without split(). Store words in HashMap and find the first word whose 
frequency */
import java.util.*;
public class FirstRepeatingWord
{
	public static void main(String args[])
	{
		String str="this is a test this is simple";
		LinkedHashMap<String,Integer>ans=new LinkedHashMap<>();
		String s="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{
				if(!ans.containsKey(s))
				{
					ans.put(s,1);
					s="";
				}
				else
				{
					System.out.println(s);
					return;
				}
			}
		}
		if(s.length()>0)
		{
			if(ans.containsKey(s))
			{
				System.out.println(s);
				return;
			}
		}

	}
}
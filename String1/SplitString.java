/*
 Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/

import java.util.*;
public class SplitString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//StringBuilder s=new StringBuilder();
		str+=" ";
		String s="";
		int max=0;
		String newStr="";
		/*
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=(str.charAt(i));
			}
			else
			{
				if(s.length()>max)
				{
					max=s.length();
					newStr=s;
				}
				
				s="";
			}
			
		}
		if(s.length()>newStr.length())
		{
			System.out.println(s);
		}
		else
		System.out.println(newStr);
		*/
		
		//using split Method
		
		String words[]=str.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			if(words[i].length()>max)
			{
				max=words[i].length();
				newStr=words[i];
			}
		}
		System.out.println(newStr);
		

	}
}
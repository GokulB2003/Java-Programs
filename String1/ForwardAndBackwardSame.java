/*. Write a java program to check each word separately to see if it reads same forward and backward.
 Input : madam level noon java
 Output : madam level noon
*/
import java.util.*;
public class ForwardAndBackwardSame
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		/*
		String ans=str.trim();
		String newString="";
		ans+=" "; 
		boolean flag=false;
		String ansString="";
		for(int i=0; i<ans.length(); i++)
		{
			flag=false;
			if(ans.charAt(i)!=' ')
			{
				newString+=ans.charAt(i);
				
			}
			else
			{
				boolean anss=check(newString);
				if(anss)
				{
					ansString+=newString;
					flag=true;
				}
				if((i<str.length()-1) && flag==true)
				{
					ansString+=" ";
				}
				newString="";
					
			}
			
		}
		System.out.println(ansString);
		*/

		/*Using split method*/
			String word[]=str.split(" ");
			String ans="";
			for(int i=0; i<word.length; i++)
			{
				if(check(word[i]))
				{
				ans+=word[i];
				ans+=" ";
				}
			}
	System.out.println(ans.trim());
	}

	public static boolean check(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;	
			}
			i++;
			j--;
		}
		return true;
	}
	
}
/*Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.*/
import java.util.*;
public class StringAnagrams
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1="Hello";
		char ch1[]=str1.toCharArray();
		String str2="eolH";
		char ch2[]=str2.toCharArray();
		boolean flag=true;
		if(ch1.length!=ch2.length)
		{
			flag=false;
			
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int j=0;
		
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=ch2[j])
			{
				flag=false;
				break;
			}
			j++;

		}
		if(flag==false)
		{
			System.out.print("Not Anagram");
		}
		else
		{
			System.out.println("Anagram");
		}
	}
}
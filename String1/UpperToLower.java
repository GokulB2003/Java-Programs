import java.util.*;
public class UpperToLower
{
	public static void main(String args[])
	{	String str="SAGAR";
		StringBuilder sb=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));	
			}
			else
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
	}
}
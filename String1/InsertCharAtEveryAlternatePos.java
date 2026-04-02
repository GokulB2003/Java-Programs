/*👉 Input: "aaabbc"
👉 Output: "a3b2c1"
*/
import java.util.*;
public class InsertCharAtEveryAlternatePos{
	public static void main(String args[])
	{
		String str="";
		String sb="aaabbc";
		//op:*a*a*b*c
		boolean flag=true;
		//StringBuilder sb=new StringBuilder("abbbc");
		for(int i=0; i<sb.length(); i++)
		{
			if(flag==true)
			{
				str+='*';
				flag=false;
			}
			else
			{
				str+=sb.charAt(i);
				flag=true;
			}
		}
		System.out.println(str);
		
		
	}
}
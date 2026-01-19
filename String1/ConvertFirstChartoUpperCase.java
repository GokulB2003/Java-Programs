/*. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy
*/
import java.util.*;
public class ConvertFirstChartoUpperCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		String newString="";
		for(int i=0; i<words.length; i++)
		{
			String s=words[i].toLowerCase();
			newString+=(char)(s.charAt(0)-32);
			newString+=s.substring(1);
			if(i<words.length-1)
			{
				newString+=" ";
			}
		}
		System.out.println(newString);
	}
}
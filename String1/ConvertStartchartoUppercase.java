/*. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy
*/
import java.util.*;
public class ConvertStartchartoUppercase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
	
		String newStr="";
		for(int i=0; i<s.length(); i++)
		{	char ch=s.charAt(i);
			if(i==0)
			{
				newStr+=(char)(ch-32);
			}
			else if(ch!=' ' && ch>='a' && ch<='z')
			{
				newStr+=(char)(ch-32);
			}
			else
			{
				newStr+=ch;
			}		
		}
		System.out.println(newStr);
		
	}
}
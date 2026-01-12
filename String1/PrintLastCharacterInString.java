/*Q12. Write a program to print the last character of a string.
 Input : India is my 
 Output : a
*/
import java.util.*;
public class PrintLastCharacterInString
{

	public static char lastChar(String str)
	{
		
		return 	str.charAt(str.length()-1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String ans="";
		if(str.length()==0)
		{
			System.out.println("String is Empty:");
			//break;
		}
		else
		{
			
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)!=' ')
				{
					ans+=str.charAt(i);
				}
				else if(str.charAt(i)==' ')
				{
					char ch=lastChar(ans);
					System.out.println("Last Character of the String is:"+ch);	
				}
			}
			
			
		}
	}	
}
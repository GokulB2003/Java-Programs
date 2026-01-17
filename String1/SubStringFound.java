/* Write a program to check whether a string contains a substring.
 Input: Java Programming, 
Java
 Output : Substring found
*/
import java.util.*;
public class SubStringFound
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Str:");
		String abc=sc.nextLine();
		System.out.println("Enter the substring:");
		String xyz=sc.nextLine();
		int j=0;
		String str=abc.toLowerCase();
		String subs=xyz.toLowerCase();
		boolean flag=false;
		for(int i=0; i<str.length()-subs.length(); i++)
		{
			 flag=true;
			
			for(; j<subs.length(); j++)
			{
				if(str.charAt(i+j)!=subs.charAt(j))
				{
					flag=false;
					break;
				}
			}
		}
		if(j==subs.length() && flag!=false)
		{
			System.out.println("Substring present");
		}
		if(flag==false)
		{
			
			System.out.println("Not found");
		}
	}

}
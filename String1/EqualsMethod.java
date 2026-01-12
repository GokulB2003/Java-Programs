/*Q13. Write a program to compare two strings.
 Input: String1- Java, String2- Java
 Output : Strings are equal
*/
import java.util.*;
public class EqualsMethod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1=sc.nextLine();
		System.out.println("Enter the Second String:");
		String str2=sc.nextLine();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("String is Not Equal:");
		}
		else
		{	int j=0;
			boolean flag=true;
			for(int i=0; i<str1.length(); i++)
			{
				if(str1.charAt(i)!=str2.charAt(j))
				{
					System.out.println("Strings are not Equal:");
					flag=false;
					break;
				}
				j++;
			}
			if(flag)
			{
				System.out.println("two Strings are Equal");
			}
			
	
		}
		
	}
}
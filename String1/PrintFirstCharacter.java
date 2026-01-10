/*Q11. Write a program to print the first character of a string.
 Input : Apple
 Output : A
*/
import java.util.*;
public class PrintFirstCharacter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		if(str.length()==0)
		{
			System.out.println("String is Empty:");
			//break;
		}
		char ch=' ';
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
				
			}
			else
			{
				if((str.charAt(i)>=65 && str.charAt(i)<=(90)) || (str.charAt(i)>=97 && str.charAt(i)<=122))
				{
					ch=str.charAt(i);
					break;
				}
			}
			
		}
		System.out.println("First character is:"+ch);
	}
}
/*Write a program to replace a character in a string.
 Input: banana, 
replace a with o
 Output : bonono
*/
import java.util.*;
public class ReplaceCharacter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the character to replace:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter new Character to replace there:");
char newChar=sc.next().charAt(0);
		
		StringBuilder p=new StringBuilder();
		/*for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				p=str.replace(str.charAt(i),newChar);
			}
		}*/
		//or without using Replace method then ..

		for(int i=0; i<str.length(); i++)
		{
			
			if(str.charAt(i)==ch)
			{
				p.append(newChar);
			}
			p.append(str.charAt(i));
		}
		System.out.println(p);
	}
}
/*Q19. Write a program to count occurrence of a given character in a string.
  Input: programming, 
 	Character→ g
  Output: 2
*/
import java.util.*;
public class CountOccurenceOfChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Str:");
		String str=sc.nextLine();
		System.out.println("ENter the character to find occurence:");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
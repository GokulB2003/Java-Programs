import java.util.*;
/*Write a program to find ASCII value of a character from a string.
 Input : A
 Output : 65
*/
public class FindASCIIValueOfChar
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str");
		String str=sc.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int AscII=(int)ch;
			System.out.println(AscII+"");
	
		}
	}
}

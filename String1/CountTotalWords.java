/*Q10. Write a program to count total words in a string.
 Input : Java is easy
 Output : 3
*/
import java.util.*;
public class CountTotalWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int count=1;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;	
			}
		}
		System.out.println("total no.of Words in the String is:"+count);
	}
}
/*Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/
import java.util.*;
public class CheckStringPalindrome
{
	public static void main(String args[])
	{	boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		int start=0;
		int end=str.length()-1;
		while(start<=end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		if(flag==false)
		{
			System.out.println("Not Palindrome:");
		}
		else
		System.out.println("Palindrome:");
		
	}

	
}
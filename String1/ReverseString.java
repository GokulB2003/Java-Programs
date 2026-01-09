/*Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ
*/
import java.util.*;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		int start=0;
		int end=str.length()-1;
		String ans="";
		for(int i=str.length()-1; i>=0; i--)
		{
			ans+=str.charAt(i);
		}
		System.out.println(ans);
	}
}
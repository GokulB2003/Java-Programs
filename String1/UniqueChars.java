/*Q22. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban
*/
import java.util.*;
public class UniqueChars
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		boolean freq[]=new boolean[256];
		for(int i=0; i<str.length(); i++)
		{
			if(freq[str.charAt(i)]==false)
			{
				freq[str.charAt(i)]=true;
			}
			
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(freq[str.charAt(i)]==true)
			{
				System.out.println(str.charAt(i));
			}
			freq[str.charAt(i)]=false;
		}
		
		
	}
}

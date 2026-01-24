/*. Reverse each word but keep word order same.
 Input : Java is fun
 Output : avaJ si nuf
*/
import java.util.*;
public class ReverseEachWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		String ans="";
		for(int i=0; i<word.length; i++)
		{
			 ans+=reverse(word[i]);
			if(i<word.length-1)
			ans+=" ";
		}
		System.out.println(ans);
	}
	public static String reverse(String str)
	{
		
		String ans="";
		for(int j=str.length()-1; j>=0; j--)
		{
			ans+=str.charAt(j);
			
		}
		return ans;
	}
}
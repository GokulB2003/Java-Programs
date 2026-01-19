/* Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/
import java.util.*;
public class WordWithMaxLength
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		String newStr="";
		String word[]=str.split(" ");
		int maxi=Integer.MIN_VALUE;
		for(int i=0; i<word.length; i++)
		{
			if(word[i].length()>maxi)
			{
				maxi=word[i].length();
				newStr=word[i];
			}
					
		}
		System.out.println(newStr);
	}
}
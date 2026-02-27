/*Count total number of words in String*/
import java.util.*;
public class TotalNumOfWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		Boolean flag=false;
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ' && flag==false)
			{
				count++;
				flag=true;
			}
			else if(ch==' ')
			{
				flag=false;
			}
	
		}
		System.out.println(count);
	}
}
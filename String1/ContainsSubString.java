/*Contains SubString or not*/
import java.util.*;
public class ContainsSubString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean found=true;
		int j=0;
		String str=sc.nextLine();
		System.out.println("Enter the substring:");
		String sub=sc.nextLine();
		for(int i=0; i<str.length()-sub.length(); i++)
		{
			for(j=0; j<sub.length(); j++)
			{
				if(str.charAt(i+j)!=sub.charAt(j))
				{	found=false;
					break;
		
				}
			}
			if(j==sub.length())
			{
				found=true;
				break;
			}
		}
		if(found)
		System.out.println("found");
		else
		System.out.println("Not Found");
	}
}
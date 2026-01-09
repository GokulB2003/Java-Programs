import java.util.*;
/*Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/
public class CountTotalCharactersInString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Length of the String"+str.length());
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total characters in the String is the:"+count);
	}
}
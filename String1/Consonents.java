/*Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5
*/
/*Q4. Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5
*/
import java.util.*;
public class Consonents
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=0;
		char ch;
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
				if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
{
		count++;
}
	
		}
System.out.println("total number of Vowels:"+count);

	}

}
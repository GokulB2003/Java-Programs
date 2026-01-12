/*Q14. Write a program to check whether a string is empty or not.
 Input : " "
 Output : String is empty
*/
import java.util.*;
public class EmptyOrNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		boolean flag=true;	
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				flag=false;
				break;
				
			}
		}
		if(flag==false)
		System.out.println("String is not empty:");
		else
		System.out.println("String is Empty:");
	}
		//or
		/*boolean ans=str.isEmpty();
		if(ans)
		System.out.println("String is empty:");
		else
		System.out.println("String is not Empty:");
		*/


	
}
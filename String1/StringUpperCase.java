/*Q8. Write a program to convert a string into uppercase.
 Input : java
 Output : JAVA
*/
import java.util.*;
public class StringUpperCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		String newStr=str.toUpperCase();
		System.out.println("In UpperCase:"+newStr);
		String LowerCase=str.toLowerCase();
		System.out.println("In Lowercase:"+LowerCase);

	}
}
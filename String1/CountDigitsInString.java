/*Q15. Write a program to count digits in a string.
 Input : abc123
 Output : 3
*/
import java.util.*;
public class CountDigitsInString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch=='0'|| ch=='1' || ch=='2' || ch=='3' || ch=='4'|| ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
			{
				count++;
			}
		}
		System.out.println("The Digits in the String is the :"+count);
		

		//OR
		/*for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		if (ch >= '0' && ch <= '9') {
        	count++;
    		}
		}
		*/
	}
}
/*Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special     symbol if
     character is alphabet or digit return true if character is digit then return false.
*/
import java.util.*;
class CheakChar
{	char ch;
	void setChar(char ch)
	{
		this.ch=ch;
	}
	Boolean checkChar()
	{
		if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')')
		{
			return true;
		}	
		else
		return false;
	}
}
public class CheckCharOrDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		CheakChar obj=new CheakChar();
		obj.setChar(ch);
		boolean abc=obj.checkChar();
		if(abc==false)
		{
			System.out.println("Either char or digit is present:");
		}
		else
		{
			System.out.println("Special character is present");
		}
		 

		
	}
}
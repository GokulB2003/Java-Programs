import java.util.*;
public class ConvertUpperToLowerCase
{
		//Without using the Inbuilt method...
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String newString="";
		/*for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			newString+=(char)(str.charAt(i)+32);
			else
			newString+=" ";
		}
		System.out.println("After converting the string into the Lowercase the string becomes:"+newString);

		*/
		//oR

		StringBuilder s=new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				s.append((char)(ch+32));
			}
			else
			s.append(ch);
		}
		System.out.println("After converting the string into the Lowercase the string becomes:"+s);
		
		
	}

}
/*Q39. Write a Java program to Enter the String and  Reverse it
  input : I am indian
  output : naidni ma I
*/
import java.util.*;
public class StringReverse
{
	public static void main(String args[])
	{
		String str="I am indian";
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
}
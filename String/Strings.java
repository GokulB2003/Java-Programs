import java.util.*;
public class Strings
{
	public static void main(String args[])
{
	String a="hello";
	String b=a.substring(0,2);
	String c=a.concat(b);
	System.out.println(c);
	String d="hello";
	"Gokul".equalsIgnoreCase("gokul");
	System.out.println(a.compareTo(d)==0);
	String abc=d.replace('e','r');
	System.out.println(d);
	System.out.println(abc);
	System.out.println(d.charAt(0));
	//if botih are == then String return 0;
	//if 1st string is greater than the second String then return positive value
	//if 2nd Strind is greater than the first then return negative value;

	System.out.println((a+b));
	
}
}
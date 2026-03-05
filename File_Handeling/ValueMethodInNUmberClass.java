import java.util.*;
public class ValueMethodInNUmberClass
{
	static int p=10;
	public int sqr()
	{
		return p*p;
	}
	public static void main(String args[])
	{
		Float f=3.14f;
		String a=Float.toString(f);//
		//System.out.println(p);
		//System.out.println(sqr());
		char ch='a';
		String str=new String(ch);
		System.out.println(str);
	}
}
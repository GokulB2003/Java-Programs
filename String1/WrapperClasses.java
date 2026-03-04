import java.util.*;
public class WrapperClasses
{
	public static void main(String args[])
	{
		Boolean b=new Boolean("run");//false
		Boolean c=new Boolean("play");//false
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b.equals(c));
		Boolean d=new Boolean(true);
		System.out.println(d);
	}
}
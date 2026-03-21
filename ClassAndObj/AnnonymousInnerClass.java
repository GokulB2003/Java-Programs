import java.util.*;
interface ABC
{
	int show(int n);
}
public class AnnonymousInnerClass
{
	public static void main(String args[])
	{
		
		
		System.out.println(((ABC)(n)->n*n).show(4));
	
	}
}
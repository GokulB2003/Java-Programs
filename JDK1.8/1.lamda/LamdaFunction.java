import java.util.*;
@FunctionalInterface
interface Square
{
	int get(int n);
}
public class LamdaFunction
{
	public static void main(String args[])
	{
		Square s=(int n)->n*n;
		int result=s.get(2);
		//System.out.println(result);
		//OR
		System.out.println(((Square)(int no)->no*no).get(5));
		
	}
}
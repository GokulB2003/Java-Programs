import java.util.*;
interface Square
{
	int getSquare(int no);
}
public class AnonymousApp
{
	public static void main(String args[])
	{
		
		System.out.println(((Square)(int no)->(no*no)).getSquare(4));
	}
	
}
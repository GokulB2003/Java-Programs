import java.util.*;
class Fact
{
	int factorial(int n,int x)
	{
		if(x==0)
		{
			return 1;
		}
		return n*factorial(n,x-1);
	}
}
public class Factorial1
{
	public static void main(String args[])
	{
		int n=5;
		Fact obj=new Fact();
		int ans=obj.factorial(n,3);
		System.out.println(ans);
	}
}
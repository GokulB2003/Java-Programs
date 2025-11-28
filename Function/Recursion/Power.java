import java.util.*;
class Fact
{
	int pow(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n*n+pow(n-1);
		
	}
}
public class Power
{
	public static void main(String args[])
	{
		int n=5;
		Fact obj=new Fact();
		int ans=obj.pow(n);
		System.out.println(ans);
	}
}
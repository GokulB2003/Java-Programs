import java.util.*;
class Fact
{
	int prod(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int rem=n%10;
		return rem*prod(n/10);
	}
}
public class ProductOfNum
{
	public static void main(String args[])
	{
		int n=121;
		Fact obj=new Fact();
		int ans=obj.prod(n);
		System.out.println(ans);
	}
}
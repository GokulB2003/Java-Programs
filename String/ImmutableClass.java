import java.util.*;
final class Test
{
	private int i;
	Test(int i)
	{
		this.i=i;
	}
	public Test modify(int j)
	{
		if(this.i==j)
		{
			return this;
		}
		else
		{
			return new Test(j);
		}
	}
}
public class ImmutableClass
{
	public static void main(String args[])
	{
		Test t1=new Test(10);
		Test t2=t1.modify(20);
		Test t3=t1.modify(10);
		if(t1==t3)
		{
			System.out.println("Both pointing to the same refernce:");
		
		}
		else
		{
			System.out.println("Both pointing to the different refernce:");
		}
		
	}
}
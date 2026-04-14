import java.util.*;
import java.util.function.*;
public class ValueGreaterThanTen
{
	public static void main(String args[])
	{
		Predicate<Integer>p1=new Predicate<>()
		{
			public boolean test(Integer v)
			{
				return v>=10;
			}
		};
		Predicate<Integer>p2=new Predicate<>()
		{
			public boolean test(Integer v)
			{
				return v<=20;
			}

		};
		Predicate<Integer>p3=p1.and(p2);
		Boolean result=p3.test(10);
		if(result)
		{
			System.out.println("greater than the 10 and less than 20");
		}
		else
		{
			System.out.println("smaller than:");
		}
	}
}
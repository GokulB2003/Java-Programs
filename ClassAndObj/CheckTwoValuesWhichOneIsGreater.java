import java.util.*;
import java.util.function.*;
public class CheckTwoValuesWhichOneIsGreater
{
	public static void main(String args[])
	{
		Predicate<Integer>first=new Predicate<>()
		{
			public boolean test(Integer n)
			{
				return n>=10;
			}
		};
		Predicate<Integer>second=new Predicate<>()
		{
			public boolean test(Integer n)
			{
				return n<=20;
			}	
		};
		
		Predicate<Integer>third=first.and(second);
		boolean result=third.test(15);
		if(result)
		{
			System.out.println("value is greater than 10 and less than 20");
		}
		else
		{
			System.out.println("value is smaller:::");
		}
		
	}
}
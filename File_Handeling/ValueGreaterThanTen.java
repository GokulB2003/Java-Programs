import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class ValueGreaterThanTen
{
	public static void main(String args[])
	{
		
		/*
		Predicate<Integer>p1=(Integer v)->v>=10;
		Predicate<Integer>p2=(Integer v)->v<=20;
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
		*/
		List<Integer>ans=Arrays.asList(10,56,20,20,30,40);
		Stream<Integer>s=ans.stream();
		Predicate<Integer>p1=new Predicate<>()
		{
			public boolean test(Integer num)
			{
				if(num%2==0)
				return true;
				else
				return false;
			}
		};
		boolean p=s.anyMatch(p1);
		System.out.println(p);
		//p.forEach((n)->System.out.println(n));
		
	}
}
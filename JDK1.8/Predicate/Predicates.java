import java.util.function.*;
public class Predicates
{
	public static void main(String args[])
	{
		Predicate<Integer>ans=new Predicate<>()
		{
			public boolean test(Integer t)
			{
				return t%2==0;
			}
		};
		boolean an=ans.test(10);
		System.out.println(an);
	}
}
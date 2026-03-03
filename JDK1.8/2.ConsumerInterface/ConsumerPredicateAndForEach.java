import java.util.function.*;
import java.util.*;
public class ConsumerPredicateAndForEach
{
	public static void main(String args[])
	{
		Predicate<Integer>ans=new Predicate<>()
		{
			public boolean test(Integer val)
			{
				return val%2==0;
			}
		};
		
		List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);
		Consumer<Integer>c=new Consumer<>()
		{
			public void accept(Integer val)
			{
				if(ans.test(val))
				{	
					System.out.println(val);
				}
				
			}
		};
		list.forEach(c);
		
	}
}
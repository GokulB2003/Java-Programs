import java.util.*;
import java.util.function.*;
public class ConsumerAndPredicateInterface
{
	public static void main(String args[])
	{
		List<Integer>list=List.of(10,20,30,40,55,67,23,19);
		Predicate<Integer>ans=(Integer num)->(num%2==0)?true:false;
		Consumer<Integer>c=(num)->{
					if(ans.test(num))
					{
						System.out.println(num);
					}
				};
		list.forEach(c);
	}
}
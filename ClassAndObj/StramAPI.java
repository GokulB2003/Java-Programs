import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class StramAPI
{
	public static void main(String args[])
	{
		List<Integer>list=List.of(10,20,30,40,5,6);
		Stream<Integer>s=list.stream();
		Function<Integer,Integer>ans=new Function<Integer,Integer>()
		{
			public Integer apply(Integer num)
			{
				return num*num;
			}
		};
		Stream<Integer>s1=s.map(ans);
		Consumer<Integer>c=new Consumer<>()
		{
			public void accept(Integer num)
			{
				int result=ans.apply(num);
				System.out.println(result);
			}
		};
		list.forEach(c);
	}
}
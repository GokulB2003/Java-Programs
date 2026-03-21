import java.util.*;
import java.util.function.*;
public class CheckEvenNum
{
	public static void main(String args[])
	{
		List<Integer>ans=List.of(10,11,2,15,90,7,4);
		Predicate<Integer>check=new Predicate<>()
		{
			public boolean test(Integer num)
			{
				if(num%2==0)
				{
					return true;
				}
			}
			
		};
		Consumer<Integer>input=new Consumer<>()
		{
			public void accept(Integer num)
			{
				if(check.test(num))
				{
					System.out.println("Even number"+num);	
				}
			}
		};
		ans.forEach(input);
		
	}
}
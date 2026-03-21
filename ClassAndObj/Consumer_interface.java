import java.util.*;
import java.util.function;
public class Consumer_interface
{
	public static void main(String args[])
	{
		Predicate<Integer>pre=new Predicate<>()
		{
			public Boolean test(Intger num)
			{
				return num>10;
			}
		};
		//pre.test(50);
		if(pre.test(50))
		{
			Consumer<Integer>c=new Consumer<>()
			{
				public void accept(Integer num)
				{
				System.out.println(num);
				}
				
			};
			c.accept(50);
		}
		else
		{
			System.out.println("not greater");
		}
	}
}
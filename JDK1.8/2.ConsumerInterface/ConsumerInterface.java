import java.util.function.*;

public class ConsumerInterface
{
	public static void main(String args[])
	{
		
		Consumer<Integer>ans=new Consumer<>()
		{
			public void accept(Integer data)->System.out.println(data);
			
		};
		ans.accept(10);
	}
}
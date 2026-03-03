import java.util.function.*;

public class ConsumerInterface
{
	public static void main(String args[])
	{
		Consumer<Integer>c=(Integer val)->System.out.println(val);
		c.accept(10);
	}
}
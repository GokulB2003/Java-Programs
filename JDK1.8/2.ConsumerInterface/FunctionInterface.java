import java.util.function.*;
public class FunctionInterface
{
	public static void main(String args[])
	{
		Function<Integer,Integer>f=new Function<>(){
		public Integer apply(Integer val)
		{
			return val*val;
		}
		};
		Integer result=f.apply(10);
		System.out.println("Square is:"+result);
	}
	
}
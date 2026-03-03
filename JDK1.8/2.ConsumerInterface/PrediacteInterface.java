import java.util.function.*;
public class PrediacteInterface
{
	public static void main(String args[])
	{
		Predicate<Integer>ans=new Predicate<>(){
		public boolean test(Integer val)
		{
			if(val%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		};
		System.out.println(ans.test(10));
	}
}
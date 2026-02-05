/*Interface With generics*/
import java.util.*;
interface Square<T>
{
	T gerSqr(T n);

}
public class AnonymApplication
{
	public static void main(String args[])
	{
		
		Square <Float>s1=new Square<Float>()
		{
			public Float gerSqr(Float n)
			{
				return n*n;
			}
		};
		float result=s1.gerSqr(5.5f);
		System.out.println(result);

		
	}
}
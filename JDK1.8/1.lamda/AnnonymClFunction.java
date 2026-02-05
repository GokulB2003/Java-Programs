/*Interface With generics*/
import java.util.*;
interface Square<T>
{
	T gerSqr(T n);

}
public class AnnonymClFunction{
	public static void main(String args[])
	{
		
		Square <Float>s1=(Float n)->n*n;
			
		float result=s1.gerSqr(5.5f);
		System.out.println(result);

		
	}
}
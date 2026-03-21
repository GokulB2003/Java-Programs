import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class SortedMethod
{
	public static void main(String args[])
	{
		List<Integer>list=List.of(10,20,30,40,70,50,20,30);
		Stream<Integer>s=list.stream();
		
		Stream<Integer>newArr=s.distinct();
		newArr.forEach(n->System.out.println(n));
	}
}

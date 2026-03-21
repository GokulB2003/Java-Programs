import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class FilterMethod
{
	public static void main(String args[])
	{
		List<Integer>list=List.of(10,20,30,40,90,29);
		Stream<Integer>s=list.stream();
		Predicate<Integer>f=(Integer num)->num>10?true:false;
		Stream<Integer>s1=s.filter(f);
		//Consumer<Integer>c=(Integer num)->(f.test(num))System.out.println(num);
		s1.forEach((val)->System.out.println(val));
	}
}

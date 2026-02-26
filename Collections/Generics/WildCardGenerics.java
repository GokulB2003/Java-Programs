import java.util.*;
class Test
{
	public void show(List<?>list)
	{
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
public class WildCardGenerics
{
	public static void main(String args[])
	{
		List<Integer>ans=new ArrayList<>();
		ans.add(40);
		ans.add(50);
		ans.add(60);
		Test t=new Test();
		t.show(ans);

	}
}
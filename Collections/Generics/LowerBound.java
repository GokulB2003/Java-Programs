/*LowerBound*/
import java.util.*;
class Demo
{
	public void show(List<? super Integer>list)
	{
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
public class LowerBound
{
	public static void main(String args[])
	{
		ArrayList<Integer>ans=new ArrayList<>();
		ArrayList<Object>obj=new ArrayList<>();
		ArrayList<Number>num=new ArrayList<>();
		
		ans.add(10);
		obj.add(90);
		num.add(100);
		
		Demo d=new Demo();
		d.show(ans);
		d.show(obj);
		d.show(num);
		
	}
}
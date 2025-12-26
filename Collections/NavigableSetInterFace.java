/**/
import java.util.*;
public class NavigableSetInterFace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*LinkedHashSet<Integer>ans=new LinkedHashSet<>();*/
		TreeSet ans=new TreeSet();
		ans.add(10);
		ans.add(20);
		ans.add(30);
		ans.add(40);
		ans.add(40);
		Iterator i=ans.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
		//After descending order
		NavigableSet s=ans.descendingSet();
		for(Object o:s)
		{
			System.out.println(o);
		}
		
		
	}
}
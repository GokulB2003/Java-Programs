/*Collection*/
import java.util.*;
import java.util.List;

public class ArrayListCollection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);


		ArrayList ans=new ArrayList();
		
		ans.add(10);
		ans.add(20);
		ans.add(30);
		ans.add(40);
		ans.set(1,50);
		ans.remove(2);
	//	System.out.println(ans.capacity());
	
		System.out.println(ans.indexOf(40));

		/*boolean ann=ans.isEmpty();
		System.out.println(ans.contains(20));
		System.out.println(ans.get(3));
		System.out.println(ans.indexOf(10));*/

		List a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(40);
		a.add(30);
		a.add(50);
		a.remove(2);
		boolean check=a.containsAll(ans);
		
		
		if(check)
		{
			System.out.println("true");
		}
		else
		System.out.println("False");
		

		/*for(Object obj:ans)
		{
			System.out.println(obj+" ");
		}*/
		
		
		//Object newArr[]=ans.toArray();
		Iterator i=ans.iterator();
		while(i.hasNext())
		{
			Object val=i.next();
		System.out.println(val);
		}

		List s=ans.subList(1,3);
		System.out.println(s);
		

	}

}
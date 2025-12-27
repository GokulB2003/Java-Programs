import java.util.*;
public class LinkedHashSetClass1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*LinkedHashSet<Integer>ans=new LinkedHashSet<>();
		//its doesn't having any capacity it has a Load factor:
		
		for(int i=0; i<5; i++)
		{
			int val=sc.nextInt();
			ans.add(val);
		}
		for(int i:ans)
		{
			System.out.println(i);
		}
		*/
		
		ArrayList<Integer>a=new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			int val=sc.nextInt();
			a.add(val);
		}
		TreeSet ans=new TreeSet(a);
		/*ans.add(10);
		ans.add(10);
		ans.add(1);
		ans.add(0);
		ans.add(0);
		*/
		Iterator li=ans.iterator();
		while(li.hasNext())
		{
			Object obj=li.next();
			System.out.println(obj);
		}

		
	}
}
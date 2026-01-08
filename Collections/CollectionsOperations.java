import java.util.*;
public class CollectionsOperations
{

	public static void main(String args[])
	{
		//Scanner sc=new Scanner(Syste);
		ArrayList ans=new ArrayList();
		ans.add(30);
		ans.add(40);
		ans.add(50);
		ans.add(60);
		ans.add(70);

		Collection c=new ArrayList();
		c.addAll(ans);
		boolean obs=c.addAll(ans);
		if(obs)
		{
			System.out.println("Element is Present All");
		}
		else
		{
			System.out.println("Element is not Present:");
		}
		for(Object obj:c)
		{
			System.out.println(obj+" ");
		}
	}	
}
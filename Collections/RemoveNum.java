/*Reverse loop concept
 Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept

*/
import java.util.Concurrent;
public class RemoveNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the numbers in ArrayList:");
		CopyOnWriteArrayList ans=new CopyOnWriteArrayList();
		for(int i=0; i<5; i++)
		{
			int val=sc.nextInt();
			ans.add(val);
		}
		int s=ans.size();
		//int i=0;
		/*while(i<s)
		{
			if((int)ans.get(i)%2==0 && i<s)
			{
				int j=i;
				while(j<ans.size()-1)
				{
					ans.set(j,ans.get(j+1));
					j++;
				}
				s--;
				i=0;
			}
			else
			i++;
		}
		System.out.println("After removing without using remove method:");*/
		
		/*for(int j=0; j<s; j++)
		{
			System.out.println(ans.get(j));
		}
		*/
		//using remove Method
		//Iterator i=ans.iterator();
		/*while(i.hasNext())
		{
			if((int)i.next()%2==0)
			{
				i.remove();
			}
		}
		*/
		Iterator i=ans.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			if((int)obj%2==0)
			{
				int index=ans.indexOf((int)obj);
				ans.remove(index);
			}
		}
		
		for(Object j:ans)
		{
			System.out.println(j);
		}
	}
}
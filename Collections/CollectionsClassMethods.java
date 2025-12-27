/*Collections class And Method
| Feature           | Collection                 | Collections                                        |
| ----------------- | -------------------------- | -------------------------------------------------- |
| Type              | Interface                  | Utility Class                                      |
| Stores data?      | Yes                        | No                                                 |
| Part of framework | Root interface             | Helper class                                       |
| Used for          | Represent group of objects | Perform operations (sort, reverse, max, min, etc.) |
| Object creation   | Cannot create              | Cannot create (only static methods)                |

*/
import java.util.*;
public class CollectionsClassMethods
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		Iterator i=arr.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		Collections.reverse(arr);
		System.out.println("After reversing:");
		Iterator j=arr.iterator();
		while(j.hasNext())
		{
			Object obj=j.next();
			System.out.println(obj);
		}
		Collections.sort(arr);
		System.out.println("After sorting the Collections becomes:");
		Iterator k=arr.iterator();
		while(k.hasNext())
		{
			Object obj=k.next();
			System.out.println(obj);
		}

		int maxV=Collections.max(arr);
		System.out.println("maximum value is the :"+maxV);
		System.out.println("convert its into Synchronized Format:");
		//public static Collection synchronizedCollection(Collection ref)
		
		ArrayList<Integer>ans=Collections.synchronizedCollection(arr);
		for(Integer m:ans)
		{
			System.out.println(m);
		}
		

		
	}
}

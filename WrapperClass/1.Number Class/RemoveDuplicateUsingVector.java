/*Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/
import java.util.*;
public class RemoveDuplicateUsingVector
{
	public static void main(String args[])
	{
		int arr[]=new int[]{10,20,20,30,30,30,40,40,40};
		Arrays.sort(arr);
		//t k=0;
		Vector v=new Vector();
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				v.add((int)arr[i]);
			}
			
		}
		v.add((int)arr[arr.length-1]);
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		
		System.out.println("By using LinkedHashSet");
		//using LinkedHashSet
		LinkedHashSet set=new LinkedHashSet();
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		
				
	}
}
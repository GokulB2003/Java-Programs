/*Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
import java.util.*;
public class FreQuencyOfUniqueNum
{
	public static void main(String args[])
	{
		/*ArrayList<Integer>arr=new ArrayList<>();
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		LinkedHashMap<Integer,Integer>ans=new LinkedHashMap<>();
		for(Integer i:arr)
		{
			ans.put(i,ans.getOrDefault(i,0)+1);

		}
		for(Map.Entry<Integer,Integer>i:ans.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}*/

		//or
		ArrayList List=new ArrayList();
		List.add(10);
		List.add(40);
		List.add(30);
		List.add(10);
		List.add(40);
		
		LinkedHashMap map=new LinkedHashMap();
		
		
		for(int i=0; i<List.size(); i++)
		{
			
			Integer count=(Integer)map.get(List.get(i));
			if(count==null)
			{
				count=0;
			}
			++count;
			map.put(List.get(i),count);
			
		}
		
		Set<Map.Entry>s=map.entrySet();
		for(Map.Entry i:s)
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
				
	}
}
import java.util.*;
public class RepeatElementUsingLinkedHashMap
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,1,1,2,3,4,2,3,1,4,51,5};
		
		LinkedHashMap map=new LinkedHashMap();
		
		Set<Map.Entry>s=map.entrySet();
		for(int i=0; i<arr.length; i++)
		{
			Integer count=(Integer)map.get(arr[i]);
			System.out.println(count);
			if(count==null)
			{
				count=0;
			}
			++count;
			System.out.println("count"+count);
			map.put(arr[i],count);
			
		}

		for(Map.Entry e:s)
		{
			if((int)e.getValue()>=2)
			{
				System.out.println("repeated Element is:"+e.getKey());
			}
		}
		
	
	}
}
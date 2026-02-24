import java.util.*;
public class COmmanElementsUsingMap
{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,5,6};
		//int arr2[]={3,4,5};
		LinkedHashMap<Integer,Integer>ans=new LinkedHashMap<>();
		for(int i=0; i<arr1.length; i++)
		{
			if(!ans.containsKey(arr1[i]))
			{
				ans.put(arr1[i],1);
			}
			else
			{
				ans.put(arr1[i],ans.get(arr1[i])+1);
			}
		}
		for(Map.Entry<Integer,Integer>s:ans.entrySet())
		{
			if(s.getValue()>1)
			{
				System.out.println(s.getKey()+" "+s.getValue());
			}
						
		}
		
	}
}
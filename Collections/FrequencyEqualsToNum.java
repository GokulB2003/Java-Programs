import java.util.*;
public class FrequencyEqualsToNum
{
	public static void main(String args[])
	{
		int arr[]={2,3,3,3,2,2,6,4,4,4,4};
		int countf=0;
		Arrays.sort(arr);
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
		for(int i:arr)
		{
			map.put(i,getOrDefault(i,0)+1);

		}
		for(Map.Entry<Integer,Integer>i:ans.entrySet())
		{
			if(i.getKey()==i.getValue())
			{
				System.out.println(System.out.println(i.getKey()));
			}
		}

	}
}

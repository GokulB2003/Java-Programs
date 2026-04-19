import java.util.*;
public class CommanElementsInJava
{
	public static void main(String args[])
	{
		String str="leetcode";
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			if(!(map.containsKey(str.charAt(i))))
			{
				map.put(str.charAt(i),1);
			}
			else
			{
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		for(Map.Entry<Character,Integer>s:map.entrySet())
		{
			if(s.getValue()==1)
			{
				System.out.println(s.getKey());
				break;
			}
		}
	}
}
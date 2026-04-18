import java.util.*;
public class MapInterface
{
	public static void main(String args[])
	{
		String str="Ram";
		LinkedHashMap<Character,Integer>ans=new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			if(!ans.containsKey(str.charAt(i)))
			{
				ans.put(str.charAt(i),1);
			}
			else
			{
				ans.put(str.charAt(i),ans.get(str.charAt(i))+1);
			}
		}
		for(Map.Entry<Character,Integer>s:ans.entrySet())
		{
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}
}
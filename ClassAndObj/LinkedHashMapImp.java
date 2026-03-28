import java.util.*;
public class LinkedHashMapImp
{
	public static void main(String args[])
	{
		String s="programming";
		LinkedHashMap<Character,Integer>ans=new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			if(!ans.containsKey(s.charAt(i)))
			{
				ans.put(s.charAt(i),1);
			}
			else
			{
				ans.put(s.charAt(i),ans.get(s.charAt(i))+1);
			}
		}
		for(Map.Entry<Character,Integer>ss:ans.entrySet())
		{
			System.out.println(ss.getKey()+" "+ss.getValue());
		}
	}
}
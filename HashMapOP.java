/*HashMap*/
import java.util.*;
import java.util.concurrent.*;
public class HashMapOP
{
	public static void main(String args[])
	{
		HashMap ans=new HashMap();
		ArrayList arr=new ArrayList();
		ans.put(1,"ABC");
		ans.put(2,"CDE");
		ans.put(3,"ABc");
		ans.put(4,"ABC");
		ans.put(5,"DEF");
		ans.put(6,"CDE");
		
		//Set s=ans.keySet();
		
		/*
		//Set<Map.Entry>s=ans.entrySet();
		for(Map.Entry e:s)
		{
			//System.out.println("Keys:"+e.getKey()+"\tvalues:"e.getValue());
			System.out.println("All Keys :"+e.keySet());
		}
		*/
		/*Set<Map.Entry>s=ans.keySet();
		for(Map.Entry e:s)
		{
			System.out.println(e);
		}
		*/
		/*Iterator i=s.iterator();
		while(i.hasNext())
		{
			Object key=i.next();
			Object val=ans.get(key);
			System.out.println(key+"------------------>"+val);
			
		}*/
		Collection c=ans.values();
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
		
	}
}
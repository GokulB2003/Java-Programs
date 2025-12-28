/*Map Interface*/
import java.util.*;
public class MapInterface
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap ans=new HashMap();
		//HashMap<Integer,String> ans=new HashMap<>();
		//System.out.println(ans.capaciy());
		ans.put(10,"1bc");
		ans.put(20,"bbb");
		ans.put(30,"aaa");
		ans.put(30,"aaa");
		

		Set<Map.Entry>set=ans.entrySet();
		//for(Map.Entry<Integer,String> e:ans.entrySet())
		for(Map.Entry e:ans.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		/*Set<Map.Entry>set=ans.entrySet();
		for(Map.Entry e:ans.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		*/
		

	}
}
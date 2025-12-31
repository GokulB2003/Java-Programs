import java.util.*;
public class DuplicateUsingMap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedHashMap map=new LinkedHashMap();
		int arr[]=new int[]{1,2,3,3,4,5,6,7,8,8};
		/*for(int i=0; i<5; i++)
		{
			System.out.println("Enter the Key:");
			Object key=sc.nextInt();
			System.out.println("Enter the Values:");
			Object val=sc.nextInt();
			map.put(key,val);

		}
		*/
		//Set<Map.Entry>s=map.entrySet();
		//Iterator i=s.iterator();
		
		/*for(Map.Entry e:s)
		{
			//System.out.println(e.getKey()+" "+e.getValue());
			Object obj=i.get(arr[i]);
			System.out.println(obj);
		}*/
		
		for(int i=0; i<arr.length; i++)
		{
			Integer obj=(Integer)map.get(arr[i]);
			//System.out.println(obj);
			if(obj==null)
			{
				obj=0;
			}
			++obj;
			map.put(arr[i],obj);//1 2 3 
		}
		
		Set<Map.Entry>s=map.entrySet();
		for(Map.Entry e:s)
		{
			if((int)e.getValue()>=2)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}
}
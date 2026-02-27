import java.util.*;
public class VectorApp
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add(40);
		v.add(50);
		int sum=0;
		//Print the data
		Iterator i=v.iterator();
		Enumeration e=v.enumeration();
		while(i.hasNextElemnt())
		{
			Object obj=i.NextElement();
			System.out.println(obj);
		}
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		for(Object obj:v)
		{
			sum+=(int)obj;
		}
		System.out.println(sum);
	}
}
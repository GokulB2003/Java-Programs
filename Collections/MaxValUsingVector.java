/*Max Value in vector:*/
import java.util.*;
public class MaxValUsingVector
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int maxv=Integer.MIN_VALUE;
		Vector v=new Vector();
		v.add(10);
		v.add(3);
		v.add(4);
		v.add(2);
		v.add(1);
		
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object val=i.next();
			if((int)val>maxv)
			{
				maxv=(int)val;
			}
		}
		System.out.println(maxv);
	}
}
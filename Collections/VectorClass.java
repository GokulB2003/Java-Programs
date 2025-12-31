import java.util.*;
public class VectorClass
{
	public static void main(String args[])
	{
		Vector v=new Vector(5);
		v.add(10);
		v.add(20);
		v.add(50);
		v.add(90);
		
		ListIterator i=v.listIterator(v.size());

		while(i.hasPrevious())
		{
			Object obj=i.previous();
			System.out.println(i.nextIndex());
			System.out.println(obj);
		}		
	}
}

//976
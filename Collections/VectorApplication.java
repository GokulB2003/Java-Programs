import java.util.*;
public class VectorApplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector();
		System.out.println("Enter the size of the vector:");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int val=sc.nextInt();
			v.add(val);
		}
		//Iterator i=v.iterator();
		//Using ListIterator 
		ListIterator i=v.listIterator(v.size());
		/*while(i.hasPrevious())
		{
			Object obj=i.previous();
			System.out.println(obj);
		}
		*/
		//Using Generics
		for(int j=v.size()-1; j>=0; j--)
		{
			System.out.println(v.get(j));
		}
	}
}
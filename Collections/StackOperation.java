import java.util.*;
public class StackOperation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		/*s.add(10);
		s.add(14);
		s.push(15);
		s.add(10);
		s.add(5);
		*/
		for(int i=0; i<5; i++)
		{
			Object val=sc.nextInt();
			s.push(val);
		}
		System.out.println("peek"+s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.capacity());
		/*for(Object obj:s)
		{
			System.out.println(obj);
		}*/
		ListIterator li=s.listIterator(s.size());
		while(li.hasPrevious())
		{
			Object val=li.previous();
			System.out.println(val);
		}
	}
	
}
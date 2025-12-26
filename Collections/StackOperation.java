import java.util.*;
public class StackOperation
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.add(10);
		s.add(14);
		s.push(15);
		s.add(10);
		s.add(5);
		System.out.println("peek"+s.peek());
		for(Object obj:s)
		{
			System.out.println(obj);
		}
	}
	
}
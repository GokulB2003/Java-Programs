import java.util.*;
interface Vehicle
{
	void car();
	class ABC implements Vehicle
	{
		public void car()
		{
			System.out.println("this is a inner class Method");
		}
	};
	

	
}

public class ClassWithinInterface
{
	public static void main(String args[])
	{
		ABC b=new ABC();
		b.car();
		
	}
}
import java.util.*;
interface Vehicle1
{
	void car();
	class ABCD implements Vehicle1
	{
		public void car()
		{
			System.out.println("this is a inner class Method");
		}
	}
	
}

public class ClassWithinInterface1
{
	public static void main(String args[])
	{
		Vehicle1.ABCD b =new Vehicle1.ABCD();
		b.car();
		
	}
}
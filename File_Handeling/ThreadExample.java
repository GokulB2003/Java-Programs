import java.util.*;

class ABC extends Thread
{
	synchronized public void run()
	{
		try
		{
			for(int i=0; i<=10; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*class C 
{
	ABC ab;
	C(ABC ab)
	{
		this.ab=ab;
	}
	public void run()
	{
		ab.printNum();
	}
}*/
public class ThreadExample
{
	public static void main(String args[])
	{

		try
		{
		ABC obj=new ABC();
		ABC obj1=new ABC();
		
		//C obj=new C(obj1);
		obj.start();
		//obj.join();
		obj1.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
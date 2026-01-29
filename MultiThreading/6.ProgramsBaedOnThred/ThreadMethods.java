/*thread Methods*/
import java.util.*;
import java.lang.*;
class Test extends Thread
{
	public void run()
	{
		try
		{
			
			for(int i=0; i<=5; i++)
			{
				System.out.println(i);
				//System.out.println(isAlive());
				//System.out.println(Thread.getClassName());
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Test1 extends Thread
{
	public void run()
	{
	
		for(int i=0; i<=5; i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadMethods
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test t1=new Test();
		t1.start();
		Test t2=new Test();
		t2.start();
		
		Test1 t3=new Test1();
		t3.run();
	}
}
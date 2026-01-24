/*
Q2. Create a thread by implementing Runnable interface and display thread names.
*/
import java.util.*;


class DisplayNames implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("names"+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class ThreadImplementingRunnable
{
	public static void main(String args[])
	{
		DisplayNames obj=new DisplayNames();
		Thread t=new Thread(obj);
		t.setName("First");
		t.start();
		DisplayNames obj1=new DisplayNames();
		Thread t1=new Thread(obj1);
		t1.setName("second");
		t1.start();
		
	}
}

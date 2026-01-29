/*Asynchronization*/
import java.util.*;
import java.lang.*;
class Table
{
	
	synchronized public void show(int no)
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i*no);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
class Two extends Thread
{
	Table t;
	public void setData(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.show(2);
			
	}
}
class Three extends Thread
{
	Table t;
	public void setData(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.show(3);
	}
}

public class AsyncExampleSameObj
{
	public static void main(String args[])
	{
		Table t=new Table();
		Two t2=new Two();
		t2.setData(t);
		t2.start();
		
		Three t3=new Three();
		t3.setData(t);
		t3.start();
		t2.start();
		
	}
}
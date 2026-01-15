import java.util.*;
class Table
{
	public void calTable(int val)
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println(val*i);
				Thread.sleep(2000);
			}
	
		}
		catch(InterruptedException e)
		{
			System.out.println("error:"+e);
		}
	}	
}
class Two extends Thread
{
	Table t;
	public void setValue(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.calTable(2);
	}
}
class Three extends Thread
{
	
	Table t;
	public void setValue(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.calTable(3);
	}
}

public class Asynchronization
{
	public static void main(String args[])
	{
		Table t=new Table();
		Two tw=new Two();
		tw.setValue(t);
		tw.start();
		Three tee=new Three();
		tee.setValue(t);
		tee.start();
		
		
	}
}

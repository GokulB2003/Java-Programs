/*THread Synchronization*/
import java.util.*;
class Table
{
	
		synchronized void calTab(int n)
		{
		    try{
				for(int i=1; i<=10; i++)
				{
				System.out.println(n*i+":"+n+":"+i);
				Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	
}
class Two extends Thread
{
	Table t;
	public void setVal(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.calTab(2);
	}
	

	
}
class Third extends Thread
{
	Table t;
	public void setVal(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.calTab(3);
	}
	

}

//import java.util.*;
public class ThreadSyncExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Table t=new Table();
		Two tw=new Two();
		tw.setVal(t);
		tw.start();
		Third th=new Third();
		th.setVal(t);
		th.start();
				
	}
}
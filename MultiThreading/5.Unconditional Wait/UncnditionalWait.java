/*Unconditional Wait*/
import java.util.*;
class Table
{
	synchronized void printT(int val)
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i*val);
				if(i==5)
				{
					wait();
				}
				Thread.sleep(1000);
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
		
	}
	synchronized void recall()
	{
		try
		{
			notifyAll();
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
	public void setData(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		t.printT(n);

		
		
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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		t.printT(n);
		
	}

}

public class UncnditionalWait
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Table t=new Table();
		Two tw=new Two();
		Three tr=new Three();
		tw.setData(t);
		tw.start();
		tr.setData(t);
		tr.start();
		do
		{	
			String msg=sc.nextLine();
			if(msg.equals("restart"))
			t.recall();
		}while(true);
	}
}
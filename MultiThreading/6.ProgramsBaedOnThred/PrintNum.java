/*Q1. Create a thread by extending Thread class and print numbers from 1 to 5.*/
import java.util.*;
class Num extends Thread
{
	public void printMethod()
	{
	
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class NewClass extends Thread
{	Num n;
	public void setData(Num n)
	{
		this.n=n;
	}
	public void run()
	{
		n.printMethod();
	}
}
public class PrintNum
{
	public static void main(String args[])
	{
		Num n=new Num();
		NewClass n1=new NewClass();
		n1.setData(n);
		n1.run();
		
	}
}
